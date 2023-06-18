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
public class Employee {
    
    private int Id;
    private String FirstName;
    private String LastName;
    private String Username;
    private String Email;
    private String PhoneNumber;
    private String Password;

    public Employee(){}
    
    public Employee(int Id, String FirstName, String LastName, String Username, String Email, String PhoneNumber, String Password) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Username = Username;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public boolean VerifyRegistration(String email, String password) throws Exception {
        try {
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            con = CreateConnectionToMySql();
            st = (Statement) con.createStatement();
            
            rs = st.executeQuery("SELECT * FROM tb_employee WHERE Email = '" + email + "' AND password = '" + password + "'");

            if (rs.next()) {
                System.out.println("Email and password are correct.");
                return true;
            }
            else{
                System.out.println("Email or password are wrong.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }       
    }
}
