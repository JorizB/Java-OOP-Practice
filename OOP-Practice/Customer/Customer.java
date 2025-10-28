/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.customer;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;

public class Customer {
      protected String name;
    protected String email;
    protected List<Double> purchaseHistory;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    // Method to add a purchase
    public void addPurchase(double amount) {
        if (amount > 0) {
            purchaseHistory.add(amount);
            System.out.println("Added purchase: $" + amount);
        } else {
            System.out.println("Purchase amount must be positive.");
        }
    }

    // Method to calculate total expenditure
    public double calculateTotalExpenditure() {
        double total = 0;
        for (double purchase : purchaseHistory) {
            total += purchase;
        }
        return total;
    }

    // Display customer info
    public void displayCustomerInfo() {
        System.out.println("Name: " + name + ", Email: " + email);
        System.out.println("Purchase History: " + purchaseHistory);
        System.out.println("Total Expenditure: $" + calculateTotalExpenditure());
    }
}

// Subclass: LoyalCustomer
class LoyalCustomer extends Customer {
    private final double discountRate; // in percentage

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    // Method to apply discount to a purchase
    public double applyDiscount(double amount) {
        double discountedAmount = amount * (1 - discountRate / 100);
        System.out.println("Original: $" + amount + ", After " + discountRate + "% discount: $" + discountedAmount);
        return discountedAmount;
    }

    @Override
    public void displayCustomerInfo() {
        super.displayCustomerInfo();
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}

// Main class to test
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", "alice@example.com");
        customer1.addPurchase(50);
        customer1.addPurchase(30);
        customer1.displayCustomerInfo();

        System.out.println("\n--- Loyal Customer ---\n");

        LoyalCustomer loyalCustomer = new LoyalCustomer("Bob", "bob@example.com", 10);
        loyalCustomer.addPurchase(loyalCustomer.applyDiscount(100));
        loyalCustomer.addPurchase(loyalCustomer.applyDiscount(50));
        loyalCustomer.displayCustomerInfo();
    }
}
