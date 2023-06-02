/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;


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
    
}