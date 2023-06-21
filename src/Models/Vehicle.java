/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Service.Service;
import java.sql.ResultSet;



/**
 *
 * @author bianc
 */
public class Vehicle {
    private String Plate;
    private String Chassi;
    private String Model;
    private String Brand;
    private int Year;
    private String Color;
    private String Description;
    private double Price;

    public Vehicle(String Plate, String Chassi, String Model, String Brand, int Year, String Color, String Description, double Price) {
        this.Plate = Plate;
        this.Chassi = Chassi;
        this.Model = Model;
        this.Brand = Brand;
        this.Year = Year;
        this.Color = Color;
        this.Description = Description;
        this.Price = Price;
    }

    public Vehicle() {}
    
    public String getPlate() {
        return Plate;
    }

    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public boolean Register() throws Exception{
        Service service = new Service();
        String query = String.format("INSERT INTO tb_vehicle (Plate, Chassi, Model, Brand, Year, Color, Description, Price) "
                + "VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')", this.Plate, this.Chassi, this.Model, 
                this.Brand, this.Year, this.Color, this.Description, this.Price);
        return service.Insert(query);
    }
    
    public boolean IsRegisteredVehicle(String plate) throws Exception {
        try {
            Service service = new Service();

            ResultSet rs = service.Select("SELECT * FROM tb_vehicle WHERE Plate = '" + plate + "'");

            if (rs.next()) {
                System.out.println("Vehicle plate: " + plate + " found.");
                return true;
            }
            else{
                System.out.println("Vehicle plate: " + plate + " not found.");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }
    }
    
    public ResultSet GetVehicles() throws Exception {
        try {
            Service service = new Service();

            return service.Select("SELECT * FROM tb_vehicle");
        } catch (Exception e) {
            System.out.println("Connection failed. Error message: " + e.getMessage());
            throw e;
        }
    }
}
