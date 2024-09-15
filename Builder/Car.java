/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private String transmissionType;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public Car(String brand, String model, int year, String color, String transmissionType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color + ", transmissionType=" + transmissionType + '}';
    }
}
