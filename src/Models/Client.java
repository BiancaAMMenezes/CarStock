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
public class Client {
    
    private String Cpf;
    private String Name;
    private String LastName;
    private String Email;
    private String PhoneNumber;
    private String Address;
    private String BithDate;

    public Client(String Cpf, String Name, String Email, String Address, String BithDate) {
        this.Cpf = Cpf;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.BithDate = BithDate;
    }

    
    
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBithDate() {
        return BithDate;
    }

    public void setBithDate(String BithDate) {
        this.BithDate = BithDate;
    }

    public boolean Register() throws Exception{
        Connection con = null;
        Statement st = null;
        con = CreateConnectionToMySql();
        st = (Statement) con.createStatement();
        String query = String.format("INSERT INTO tb_client (Cpf, Name, Email, Birth_Date, Address) "
                + "VALUES ('%s','%s','%s','%s','%s')", this.Cpf, this.Name, this.Email, this.BithDate, this.Address);
        System.out.println(query);
        st.execute(query);
        return true;
    }
    
}
