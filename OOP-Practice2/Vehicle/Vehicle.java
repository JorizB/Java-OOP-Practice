/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicle;

/**
 *
 * @author Administrator
 */
public class Vehicle {
     protected String make;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details (can be overridden)
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private final double trunkSize; // in cubic feet

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cu.ft.");
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private final double payloadCapacity; // in pounds

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " lbs");
    }
}

// Main class to test
public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 15.1);
        Truck truck = new Truck("Ford", "F-150", 2023, 3000);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nTruck Details:");
        truck.displayDetails();
    }
}
