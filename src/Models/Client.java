/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import static Connection.ConnectionFactory.CreateConnectionToMySql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

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
    private Date BithDate;

    public Client(String Cpf, String Name, String LastName, String Email, String PhoneNumber, String Address, Date BithDate) {
        this.Cpf = Cpf;
        this.Name = Name;
        this.LastName = LastName;
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

    public Date getBithDate() {
        return BithDate;
    }

    public void setBithDate(Date BithDate) {
        this.BithDate = BithDate;
    }

    public boolean RegisterClient() throws Exception{
        Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            con = CreateConnectionToMySql();
            st = (Statement) con.createStatement();
            
            rs = st.executeQuery("");
            
            return true;
    }
    
}
