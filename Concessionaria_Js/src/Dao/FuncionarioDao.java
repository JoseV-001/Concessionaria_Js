package concessionaria_js;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    private Connection conexao;

    // Construtor que recebe a conexão como parâmetro
    public FuncionarioDao(Connection conn) {
        this.conexao = conn;
    }

    public boolean conectar() {
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

    public void inserirFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (nome, CPF, endereco, estado, cep, email, telefone, dataContratacao, cargo) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCPF());
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getEstado());
            stmt.setString(5, funcionario.getCep());
            stmt.setString(6, funcionario.getEmail());
            stmt.setString(7, funcionario.getTelefone());
            stmt.setDate(8, new java.sql.Date(funcionario.getDataContratacao().getTime()));
            stmt.setString(9, funcionario.getCargo());
            
            stmt.executeUpdate();
            System.out.println("Funcionário inserido com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir funcionário: " + e.getMessage());
            throw e;
        }
    }

    public Funcionario buscarFuncionarioPorId(int id) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        Funcionario funcionario = null;
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                funcionario = montarFuncionario(rs);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar funcionário por ID: " + e.getMessage());
            throw e;
        }
        
        return funcionario;
    }

    public List<Funcionario> listarFuncionarios() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Funcionario funcionario = montarFuncionario(rs);
                funcionarios.add(funcionario);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar funcionários: " + e.getMessage());
            throw e;
        }
        
        return funcionarios;
    }

    private Funcionario montarFuncionario(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nome = rs.getString("nome");
        String CPF = rs.getString("CPF");
        String endereco = rs.getString("endereco");
        String estado = rs.getString("estado");
        String cep = rs.getString("cep");
        String email = rs.getString("email");
        String telefone = rs.getString("telefone");
        java.sql.Date dataContratacao = rs.getDate("dataContratacao");
        String cargo = rs.getString("cargo");
        
        Funcionario funcionario = new Funcionario(id, nome, CPF, endereco, estado, cep, email, telefone, dataContratacao, cargo);
        return funcionario;
    }

    public boolean excluirFuncionario(int idFuncionario) throws SQLException {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idFuncionario);
            
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Funcionário deletado com sucesso.");
                return true;
            } else {
                System.out.println("Nenhum funcionário foi deletado.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar funcionário: " + e.getMessage());
            throw e;
        }
    }

    public void atualizarFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "UPDATE funcionario SET nome = ?, CPF = ?, endereco = ?, estado = ?, cep = ?, " +
                     "email = ?, telefone = ?, dataContratacao = ?, cargo = ? WHERE id = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCPF());
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getEstado());
            stmt.setString(5, funcionario.getCep());
            stmt.setString(6, funcionario.getEmail());
            stmt.setString(7, funcionario.getTelefone());
            stmt.setDate(8, new java.sql.Date(funcionario.getDataContratacao().getTime()));
            stmt.setString(9, funcionario.getCargo());
            stmt.setInt(10, funcionario.getId());
            
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Funcionário atualizado com sucesso.");
            } else {
                System.out.println("Nenhum funcionário foi atualizado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar funcionário: " + e.getMessage());
            throw e;
        }
    }
}
