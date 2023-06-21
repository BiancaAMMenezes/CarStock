/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import static Connection.ConnectionFactory.CreateConnectionToMySql;
import java.sql.*;

/**
 *
 * @author bianc
 */
public class Service {
    
    private Connection con;
    private Statement st;

    public ResultSet Select(String query) throws Exception {
        try {
            con = CreateConnectionToMySql();
            st = (Statement) con.createStatement();
            return st.executeQuery(query);

        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }
    }
    
    public Boolean Insert(String query) throws Exception {
        try {
            con = CreateConnectionToMySql();
            st = (Statement) con.createStatement();
            st.execute(query);
            return true;

        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }
    }
}
