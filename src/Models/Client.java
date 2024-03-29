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
public class Client {
    
    private String Cpf;
    private String Name;
    private String Email;
    private String Address;
    private String BithDate;

    public Client(String Cpf, String Name, String Email, String Address, String BithDate) {
        this.Cpf = Cpf;
        this.Name = Name;
        this.Email = Email;
        this.Address = Address;
        this.BithDate = BithDate;
    }

    public Client() {}

    
    
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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
        Service service = new Service();
        String query = String.format("INSERT INTO tb_client (Cpf, Name, Email, Birth_Date, Address) "
                + "VALUES ('%s','%s','%s','%s','%s')", this.Cpf, this.Name, this.Email, this.BithDate, this.Address);
        return service.Insert(query);
    }

    public boolean IsRegisteredClient(String cpf) throws Exception {
        try {
            Service service = new Service();
            ResultSet rs = service.Select("SELECT * FROM tb_client WHERE Cpf = '" + cpf + "'");

            if (rs.next()) {
                System.out.println("Client cpf: " + cpf + " found.");
                return true;
            }
            else{
                System.out.println("Client cpf: " + cpf + " not found.");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }
    }
    
    public ResultSet GetClients() throws Exception {
        try {
            Service service = new Service();

            return service.Select("SELECT * FROM tb_client");
        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }
    }
}
