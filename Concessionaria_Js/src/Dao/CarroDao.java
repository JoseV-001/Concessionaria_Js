package concessionaria_js;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDao {

    private Connection conexao;

    // Construtor que recebe a conexão como parâmetro
    public CarroDao(Connection conn) {
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

    public void inserirCarro(Carro carro) throws SQLException {
        String sql = "INSERT INTO carro (modelo, marca, ano, cor, placa, preco) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, carro.getModelo());
            stmt.setString(2, carro.getMarca());
            stmt.setInt(3, carro.getAno());
            stmt.setString(4, carro.getCor());
            stmt.setString(5, carro.getPlaca());
            stmt.setDouble(6, carro.getPreco());

            stmt.executeUpdate();
            System.out.println("Carro inserido com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir carro: " + e.getMessage());
            throw e;
        }
    }

    public void atualizarCarro(Carro carro) throws SQLException {
        String sql = "UPDATE carro SET modelo = ?, marca = ?, ano = ?, cor = ?, placa = ?, preco = ? WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, carro.getModelo());
            stmt.setString(2, carro.getMarca());
            stmt.setInt(3, carro.getAno());
            stmt.setString(4, carro.getCor());
            stmt.setString(5, carro.getPlaca());
            stmt.setDouble(6, carro.getPreco());
            stmt.setInt(7, carro.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Carro atualizado com sucesso.");
            } else {
                System.out.println("Nenhum carro foi atualizado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar carro: " + e.getMessage());
            throw e;
        }
    }

    public void excluirCarro(int idCarro) throws SQLException {
        String sql = "DELETE FROM carro WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idCarro);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Carro deletado com sucesso.");
            } else {
                System.out.println("Nenhum carro foi deletado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar carro: " + e.getMessage());
            throw e;
        }
    }

    public Carro buscarCarroPorId(int id) throws SQLException {
        String sql = "SELECT * FROM carro WHERE id = ?";
        Carro carro = null;

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                carro = montarCarro(rs);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar carro por ID: " + e.getMessage());
            throw e;
        }

        return carro;
    }

    public List<Carro> listarCarros() throws SQLException {
        List<Carro> carros = new ArrayList<>();
        String sql = "SELECT * FROM carro";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Carro carro = montarCarro(rs);
                carros.add(carro);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar carro: " + e.getMessage());
            throw e;
        }

        return carros;
    }

    private Carro montarCarro(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String modelo = rs.getString("modelo");
        String marca = rs.getString("marca");
        int ano = rs.getInt("ano");
        String cor = rs.getString("cor");
        String placa = rs.getString("placa");
        double preco = rs.getDouble("preco");

        Carro carro = new Carro(id, modelo, marca, ano, cor, placa, preco);
        return carro;
    }
}
