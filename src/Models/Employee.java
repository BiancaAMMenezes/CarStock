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
    
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNumber;
    private String Password;

    public Employee(){}
    
    public Employee(String FirstName, String LastName, String Email, String PhoneNumber, String Password) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
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
    
    public boolean Register() throws Exception{
        Connection con = null;
        Statement st = null;
        con = CreateConnectionToMySql();
        st = (Statement) con.createStatement();
        String query = String.format("INSERT INTO tb_employee (First_Name, Last_Name, Email, Phone_number, password) "
                + "VALUES ('%s','%s','%s','%s','%s')", this.FirstName, 
                this.LastName, this.Email, this.PhoneNumber, this.Password);
        System.out.println(query);
        st.execute(query);
        return true;
    }
}
