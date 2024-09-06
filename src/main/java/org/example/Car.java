package org.example;

////Step 1: Create a base class "Vehicle" with properties like "Manufacturer", "Model", and "Year of Manufacture".
////Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties like "Number of Doors".
////Step 3: Implement a method in the "Vehicle" class that outputs information about the vehicle.
////Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.
////Step 5: Create instances of the "Vehicle" and "Car" classes and call the methods to output the information.

public class Car extends Vehicle {
   private int numbersOfDoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numbersOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numbersOfDoors = numbersOfDoors;
    }


    @Override
    public String toString() {
        return "Car{" +
                "numbersOfDoors=" + numbersOfDoors +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
