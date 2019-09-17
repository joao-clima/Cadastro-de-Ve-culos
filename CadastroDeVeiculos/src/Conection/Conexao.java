package Conection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection()throws SQLException, ClassNotFoundException{
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/BDName";
        String usuario = "usuario";
        String senha = "senha";
        
        try{
            Class.forName(driver);
            return (Connection) DriverManager.getConnection (url, usuario, senha);
        }catch (SQLException ex){
            throw new RuntimeException("Erro de Conexão: ", ex);
        }
        
    }
    
}
