/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import java.util.ArrayList;

public class ListCar {
    private final ArrayList<Car> carList;

    public ListCar() {
        carList = new ArrayList<>();
    }
    
    public void add(Car car){
        carList.add(car);
    }
    
    public void removeCar(String brand) {
        for (Car car : carList) {
            if (car.getBrand().equals(brand)) {
                carList.remove(car);
                System.out.println("coche con marca " + brand + " eliminado exitosamente!");
                return;
            }
        }
        System.out.println("coche con marca " + brand + " extraviado!");
    }

    public void displayCars() {
        for (Car car : carList) {
            System.out.println("-------------------------");
            System.out.println("");
            System.out.println("Detalles del coche:");
            System.out.println("Marca: " + car.getBrand());
            System.out.println("Modelo: " + car.getModel());
            System.out.println("Año: " + car.getYear());
            System.out.println("Color: " + car.getColor());
            System.out.println("Tipo de transmisión: " + car.getTransmissionType());
            System.out.println("");
            System.out.println("-------------------------");
        }
    }
    public boolean isEmpty() {
        return carList.isEmpty();
    }
}
