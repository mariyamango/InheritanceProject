package org.example;
//Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.
//
//Implement a method in the "Motorcycle" class that returns the type of motorcycle (e.g. Chopper, Sportbike, Cruiser).
//
//Create instances of both "Car" and "Motorcycle" and call the methods to output the information.
//
//Discuss together how inheritance was applied in this scenario and what advantages it offers.

public class Motorcycle extends Vehicle{
    private String typeOFMotorcycle;
    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String typeOFMotorcycle) {
        super(manufacturer, model, yearOfManufacture);
        this.typeOFMotorcycle = typeOFMotorcycle;
    }

    public String getTypeOFMotorcycle() {
        return typeOFMotorcycle;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                " manufacturer='" + manufacturer + '\'' +
                ", typeOFMotorcycle='" + typeOFMotorcycle + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", model='" + model + '\'' +

                '}';
    }
}
