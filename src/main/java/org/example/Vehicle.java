package org.example;

//Step 1: Create a base class "Vehicle" with properties like "Manufacturer", "Model", and "Year of Manufacture".
//Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties like "Number of Doors".
//Step 3: Implement a method in the "Vehicle" class that outputs information about the vehicle.
//Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.
//Step 5: Create instances of the "Vehicle" and "Car" classes and call the methods to output the information.

public class Vehicle {
    String manufacturer;
    String model;
    int yearOfManufacture;

    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
