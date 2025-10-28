/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.building;

/**
 *
 * @author Administrator
 */
public class Building {
       protected String address;
    protected int numberOfFloors;
    protected double totalArea; // in square meters

    // Constructor
    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    // Method to display building details
    public void displayDetails() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq.m.");
    }

    // Abstract method to calculate rent (to be implemented in subclasses)
    public double calculateRent() {
        return 0.0;
    }
}

// Subclass: ResidentialBuilding
class ResidentialBuilding extends Building {
    private final int numberOfApartments;
    private final double rentPerApartment; // per month

    public ResidentialBuilding(String address, int numberOfFloors, double totalArea,
                               int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    @Override
    public double calculateRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: $" + rentPerApartment);
        System.out.println("Total Rent: $" + calculateRent());
    }
}

// Subclass: CommercialBuilding
class CommercialBuilding extends Building {
    private final double officeSpace; // in sq.m.
    private final double rentPerSqMeter;

    public CommercialBuilding(String address, int numberOfFloors, double totalArea,
                              double officeSpace, double rentPerSqMeter) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSqMeter = rentPerSqMeter;
    }

    @Override
    public double calculateRent() {
        return officeSpace * rentPerSqMeter;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Office Space: " + officeSpace + " sq.m.");
        System.out.println("Rent per sq.m.: $" + rentPerSqMeter);
        System.out.println("Total Rent: $" + calculateRent());
    }
}

// Main class to test
public class BuildingTest {
    public static void main(String[] args) {
        ResidentialBuilding resBuilding = new ResidentialBuilding("123 Main St", 5, 1500, 10, 1200);
        CommercialBuilding comBuilding = new CommercialBuilding("456 Commerce Rd", 8, 3000, 2000, 25);

        System.out.println("Residential Building Details:");
        resBuilding.displayDetails();

        System.out.println("\nCommercial Building Details:");
        comBuilding.displayDetails();

    }
}
