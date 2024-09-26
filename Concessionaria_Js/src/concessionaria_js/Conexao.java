
package concessionaria_js;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
        public Connection getConexao(){
        try{
       
            String url = "jdbc:mysql://localhost/concessionaria_js";
        String user = "root";
        String password = "36814426";
        
            Connection conn  = DriverManager.getConnection(url,user,password);         
            return conn;
            
        }catch(Exception e){
            
            System.out.println("Erro ao conectar com o banco de dados " + e.getMessage());
            return null;
        }
    }
    
}