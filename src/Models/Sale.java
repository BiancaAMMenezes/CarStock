/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import static Connection.ConnectionFactory.CreateConnectionToMySql;
import java.sql.*;

/**
 *
 * @author bianc
 */
public class Sale {
    private String Date;
    private String Description;
    private String Plate;
    private String Id_Employee;
    private String Cpf_Client;
    
    public Sale(String Date, String Description, String Plate, String Id_Employee, String Cpf_Client) {
        this.Date = Date;
        this.Description = Description;
        this.Plate = Plate;
        this.Id_Employee = Id_Employee;
        this.Cpf_Client = Cpf_Client;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    public String getId_Employee() {
        return Id_Employee;
    }

    public void setId_Employee(String Id_Employee) {
        this.Id_Employee = Id_Employee;
    }

    public String getCpf_Client() {
        return Cpf_Client;
    }

    public void setCpf_Client(String Cpf_Client) {
        this.Cpf_Client = Cpf_Client;
    }
    
    public boolean Register() throws Exception{
        Connection con = null;
        Statement st = null;
        con = CreateConnectionToMySql();
        st = (Statement) con.createStatement();
        String query = String.format("INSERT INTO tb_sale (Date, Description, Plate, Id_Employee, Cpf_Client) "
                + "VALUES ('%s','%s','%s','%s','%s')", this.Date, this.Description, this.Plate, this.Id_Employee, this.Cpf_Client);
        System.out.println(query);
        st.execute(query);
        return true;
    }
}
