package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("VW", "Passat", 2015);
        System.out.println(vehicle1);

        Car car1 = new Car("Toyota", "Corolla", 1993,3);
        System.out.println(car1);
    }
}