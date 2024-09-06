package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("VW", "Passat", 2015);
        System.out.println(vehicle1);

        Car car1 = new Car("Toyota", "Corolla", 1993,3);
        System.out.println(car1);

        Car car2 = new Car("BMW", "X1", 2020, 5);
        System.out.println(car2);

        Motorcycle BMW = new Motorcycle("BMW", "Sound Genetic", 2024, "Sportbike");
        System.out.println(BMW);
        System.out.println(BMW.getTypeOFMotorcycle());
    }


}