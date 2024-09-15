/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import java.util.ArrayList;

public class CarBuilder {
    private String brand;
    private String model;
    private int year;
    private String color;
    private String transmissionType;
    private ArrayList<Car> cars;

    public CarBuilder() {
        cars = new ArrayList<>();
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Car build() {
        Car car = new Car(brand, model, year, color, transmissionType);
        cars.add(car);
        return car;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void displayCars() {
        for (Car car : cars) {
            System.out.println("Car details:");
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println("Color: " + car.getColor());
            System.out.println("Transmission Type: " + car.getTransmissionType());
            System.out.println("-------------------------");
        }
    }
}
