/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsproduct;

/**
 *
 * @author Administrator
 */
public class ElectronicsProduct {
      protected String productID;
    protected String name;
    protected double price;

    // Constructor
    public ElectronicsProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            double discountAmount = price * discountPercent / 100;
            price -= discountAmount;
            System.out.println("Discount of " + discountPercent + "% applied. New price: $" + price);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Method to calculate final price
    public double calculateFinalPrice() {
        return price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Subclass: WashingMachine
class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod; // in years

    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Method to extend warranty
    public void extendWarranty(int extraYears) {
        if (extraYears > 0) {
            warrantyPeriod += extraYears;
            System.out.println("Warranty extended by " + extraYears + " years. Total warranty: " + warrantyPeriod + " years");
        } else {
            System.out.println("Invalid number of years.");
        }
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

// Main class to test
public class ElectronicsTest {
    public static void main(String[] args) {
        ElectronicsProduct product = new ElectronicsProduct("E101", "Smartphone", 699.99);
        product.displayProductDetails();
        product.applyDiscount(10);

        System.out.println("\n--- Washing Machine ---\n");

        WashingMachine wm = new WashingMachine("WM202", "LG Washer", 899.99, 2);
        wm.displayProductDetails();
        wm.applyDiscount(15);
        wm.extendWarranty(1);

    }
}
