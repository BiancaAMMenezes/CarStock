/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Service.Service;
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
            Service service = new Service();

            ResultSet rs = service.Select("SELECT * FROM tb_employee WHERE Email = '" + email + "' AND Password = '" + password + "'");

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
        Service service = new Service();
        String query = String.format("INSERT INTO tb_employee (First_Name, Last_Name, Email, Phone_number, Password) "
                + "VALUES ('%s','%s','%s','%s','%s')", this.FirstName, 
                this.LastName, this.Email, this.PhoneNumber, this.Password);
        return service.Insert(query);
    }
    
    public boolean IsRegisteredEmployee(String id) throws Exception {
        try {
            Service service = new Service();

            ResultSet rs = service.Select("SELECT * FROM tb_employee WHERE Id_Employee = '" + id + "'");

            if (rs.next()) {
                System.out.println("Employee id: " + id + " found.");
                return true;
            }
            else{
                System.out.println("Employee id: " + id + " not found.");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }
    }
}
