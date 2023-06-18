/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import java.sql.*;

/**
 *
 * @author bianc
 */
public class ConnectionFactory {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/carstock";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection CreateConnectionToMySql() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }
}
