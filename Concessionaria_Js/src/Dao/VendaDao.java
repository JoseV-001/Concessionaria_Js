package concessionaria_js;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendaDao {

    private Connection conexao;

    // Construtor que recebe a conexão como parâmetro
    public VendaDao(Connection conn) {
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

    public void inserirVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO vendas (dataVenda, carroVendido, cliente, funcionarioVendas, valor) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(venda.getDataVenda().getTime()));
            stmt.setString(2, venda.getCarroVendido());
            stmt.setString(3, venda.getCliente());
            stmt.setString(4, venda.getFuncionarioVendas());
            stmt.setDouble(5, venda.getValor());

            stmt.executeUpdate();
            System.out.println("Venda inserida com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
            throw e;
        }
    }

    public boolean excluirVenda(int idVenda) throws SQLException {
        String sql = "DELETE FROM vendas WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idVenda);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Venda deletada com sucesso.");
                return true; // Retorna true se pelo menos uma linha foi deletada
            } else {
                System.out.println("Nenhuma venda foi deletada.");
                return false; // Retorna false se nenhuma venda foi deletada
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar venda: " + e.getMessage());
            throw e;
        }
    }

    public Venda buscarVendaPorId(int id) throws SQLException {
        String sql = "SELECT * FROM vendas WHERE id = ?";
        Venda venda = null;

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                venda = montarVenda(rs);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar venda por ID: " + e.getMessage());
            throw e;
        }

        return venda;
    }

    public List<Venda> listarVendas() throws SQLException {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT * FROM vendas";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda venda = montarVenda(rs);
                vendas.add(venda);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar vendas: " + e.getMessage());
            throw e;
        }

        return vendas;
    }

    private Venda montarVenda(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        Date dataVenda = rs.getDate("dataVenda");
        String carroVendido = rs.getString("carroVendido");
        String cliente = rs.getString("cliente");
        String funcionarioVendas = rs.getString("funcionarioVendas");
        double valor = rs.getDouble("valor");

        Venda venda = new Venda(id, dataVenda, carroVendido, cliente, funcionarioVendas, valor);
        return venda;
    }

    public void atualizarVenda(Venda venda) throws SQLException {
        String sql = "UPDATE vendas SET dataVenda = ?, carroVendido = ?, cliente = ?, funcionarioVendas = ?, valor = ? WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(venda.getDataVenda().getTime()));
            stmt.setString(2, venda.getCarroVendido());
            stmt.setString(3, venda.getCliente());
            stmt.setString(4, venda.getFuncionarioVendas());
            stmt.setDouble(5, venda.getValor());
            stmt.setInt(6, venda.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Venda atualizada com sucesso.");
            } else {
                System.out.println("Nenhuma venda foi atualizada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar venda: " + e.getMessage());
            throw e;
        }
    }
}
