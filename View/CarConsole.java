/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Builder.Car;
import Builder.CarBuilder;
import Builder.ListCar;
import java.util.Scanner;

public class CarConsole {
    ListCar list;
    
    public CarConsole() {
        list=new ListCar();
    }
    
    public void show(){
        int op=0;
        do{
            op=menu();
            switch(op){
                case 1->{
                    insert();
                }
                case 2->{
                    delete();
                }
                case 3->{
                    display();
                }
                case 4->{
                    System.out.println("Finalización del codigo");
                    break;
                }
            }
        }while(op!=4);
    }
    
    private int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Insertar");
        System.out.println("2. Eliminar");
        System.out.println("3. Mostrar");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt(); 
    }
    
    private void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la marca: ");
        String brand = scanner.nextLine();
        System.out.print("ingrese el modelo: ");
        String model = scanner.nextLine();
        System.out.print("ingrese el  año: ");
        int year = scanner.nextInt();
        System.out.print("ingrese el color: ");
        String color = scanner.next();
        System.out.print("ingrese tipo de transmisión: ");
        String transmissionType = scanner.next();
        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder
                .setBrand(brand)
                .setModel(model)
                .setYear(year)
                .setColor(color)
                .setTransmissionType(transmissionType)
                .build();

        list.add(car);
        System.out.println("Coche añadido correctamente!");
    }
    
    private void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del auto a eliminar: ");
        String brand = scanner.nextLine();
        list.removeCar(brand);
    }
    
    public void display(){
        if (list.isEmpty()) {
            System.out.println("Coche no registrado!");
        } else {
            list.displayCars();
        }
    }
}
