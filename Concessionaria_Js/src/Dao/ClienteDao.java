package concessionaria_js;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    private Connection conexao;

    // Construtor que recebe a conexão como parâmetro
    public ClienteDao(Connection conn) {
        this.conexao = conn;
    }

    public boolean conectar() {
        // Implementação simples para verificar se a conexão está ativa
        try {
            return conexao != null && !conexao.isClosed();
        } catch (SQLException ex) {
            System.out.println("Erro ao verificar conexão: " + ex.getMessage());
            return false;
        }
    }

    public void desconectar() throws SQLException {
        if (conexao != null) {
            conexao.close();
        }
    }

    public boolean excluirCliente(int idCliente) throws SQLException {
        String sql = "DELETE FROM cliente WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Cliente deletado com sucesso.");
                return true; // Retorna true se pelo menos uma linha foi deletada
            } else {
                System.out.println("Nenhum cliente foi deletado.");
                return false; // Retorna false se nenhum cliente foi deletado
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
            throw e;
        }
    }

    public void inserirCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, endereco, CPF, estado, cep, email, telefone, historicoCompras, dataNascimento) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCPF());
            stmt.setString(4, cliente.getEstado());
            stmt.setString(5, cliente.getCep());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getTelefone());
            stmt.setString(8, cliente.getHistoricoCompras());
            stmt.setDate(9, new java.sql.Date(cliente.getDataNascimento().getTime()));

            stmt.executeUpdate();
            System.out.println("Cliente inserido com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
            throw e;
        }
    }

    public Cliente buscarClientePorId(int id) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        Cliente cliente = null;

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = montarCliente(rs);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar cliente por ID: " + e.getMessage());
            throw e;
        }

        return cliente;
    }

    public List<Cliente> listarClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = montarCliente(rs);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
            throw e;
        }

        return clientes;
    }

    private Cliente montarCliente(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nome = rs.getString("nome");
        String endereco = rs.getString("endereco");
        String CPF = rs.getString("CPF");
        String estado = rs.getString("estado");
        String cep = rs.getString("cep");
        String email = rs.getString("email");
        String telefone = rs.getString("telefone");
        String historicoCompras = rs.getString("historicoCompras");
        java.sql.Date dataNascimento = rs.getDate("dataNascimento");

        Cliente cliente = new Cliente(id, nome, endereco, CPF, estado, cep, email, telefone, historicoCompras, dataNascimento);
        return cliente;
    }

    public void atualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nome = ?, endereco = ?, CPF = ?, estado = ?, cep = ?, email = ?, "
                + "telefone = ?, historicoCompras = ?, dataNascimento = ? WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCPF());
            stmt.setString(4, cliente.getEstado());
            stmt.setString(5, cliente.getCep());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getTelefone());
            stmt.setString(8, cliente.getHistoricoCompras());
            stmt.setDate(9, new java.sql.Date(cliente.getDataNascimento().getTime()));
            stmt.setInt(10, cliente.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Cliente atualizado com sucesso.");
            } else {
                System.out.println("Nenhum cliente foi atualizado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
            throw e;
        }
    }
}
