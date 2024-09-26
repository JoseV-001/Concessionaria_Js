package concessionaria_js;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDao {

    private Connection conexao;

    // Construtor que recebe a conexão como parâmetro
    public FornecedorDao(Connection conn) {
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

    public boolean excluirFornecedor(int idFornecedor) throws SQLException {
        String sql = "DELETE FROM fornecedor WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idFornecedor);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Fornecedor deletado com sucesso.");
                return true; // Retorna true se pelo menos uma linha foi deletada
            } else {
                System.out.println("Nenhum fornecedor foi deletado.");
                return false; // Retorna false se nenhum fornecedor foi deletado
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar fornecedor: " + e.getMessage());
            throw e;
        }
    }

    public void inserirFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO fornecedor (nome, endereco, estado, cep, telefone, cnpj, observacoes) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEndereco());
            stmt.setString(3, fornecedor.getEstado());
            stmt.setString(4, fornecedor.getCep());
            stmt.setString(5, fornecedor.getTelefone());
            stmt.setString(6, fornecedor.getCnpj());
            stmt.setString(7, fornecedor.getObservacoes());

            stmt.executeUpdate();
            System.out.println("Fornecedor inserido com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir fornecedor: " + e.getMessage());
            throw e;
        }
    }

    public Fornecedor buscarFornecedorPorId(int id) throws SQLException {
        String sql = "SELECT * FROM fornecedor WHERE id = ?";
        Fornecedor fornecedor = null;

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                fornecedor = montarFornecedor(rs);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar fornecedor por ID: " + e.getMessage());
            throw e;
        }

        return fornecedor;
    }

    public List<Fornecedor> listarFornecedores() throws SQLException {
        List<Fornecedor> fornecedores = new ArrayList<>();
        String sql = "SELECT * FROM fornecedor";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = montarFornecedor(rs);
                fornecedores.add(fornecedor);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar fornecedores: " + e.getMessage());
            throw e;
        }

        return fornecedores;
    }

    private Fornecedor montarFornecedor(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nome = rs.getString("nome");
        String endereco = rs.getString("endereco");
        String estado = rs.getString("estado");
        String cep = rs.getString("cep");
        String telefone = rs.getString("telefone");
        String cnpj = rs.getString("cnpj");
        String observacoes = rs.getString("observacoes");

        Fornecedor fornecedor = new Fornecedor(id, nome, endereco, estado, cep, telefone, cnpj, observacoes);
        return fornecedor;
    }

    public void atualizarFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "UPDATE fornecedor SET nome = ?, endereco = ?, estado = ?, cep = ?, telefone = ?, cnpj = ?, observacoes = ? WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEndereco());
            stmt.setString(3, fornecedor.getEstado());
            stmt.setString(4, fornecedor.getCep());
            stmt.setString(5, fornecedor.getTelefone());
            stmt.setString(6, fornecedor.getCnpj());
            stmt.setString(7, fornecedor.getObservacoes());
            stmt.setInt(8, fornecedor.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Fornecedor atualizado com sucesso.");
            } else {
                System.out.println("Nenhum fornecedor foi atualizado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar fornecedor: " + e.getMessage());
            throw e;
        }
    }
}
