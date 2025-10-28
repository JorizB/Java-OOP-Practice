/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurant;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<String> menuItems;
    private final List<Double> prices;
    private final List<Double> ratings;

    // Constructor
    public Restaurant() {
        menuItems = new ArrayList<>();
        prices = new ArrayList<>();
        ratings = new ArrayList<>();
    }

    // Method to add a menu item
    public void addItem(String itemName, double price, double rating) {
        menuItems.add(itemName);
        prices.add(price);
        ratings.add(rating);
        System.out.println("Added item: " + itemName + " | Price: $" + price + " | Rating: " + rating);
    }

    // Method to remove a menu item
    public void removeItem(String itemName) {
        int index = menuItems.indexOf(itemName);
        if (index != -1) {
            menuItems.remove(index);
            prices.remove(index);
            ratings.remove(index);
            System.out.println("Removed item: " + itemName);
        } else {
            System.out.println("Item \"" + itemName + "\" not found in the menu.");
        }
    }

    // Method to calculate average rating
    public double calculateAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        double sum = 0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    // Method to display the menu
    public void displayMenu() {
        System.out.println("\nRestaurant Menu:");
        if (menuItems.isEmpty()) {
            System.out.println("No items on the menu.");
            return;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " | Price: $" + prices.get(i) + " | Rating: " + ratings.get(i));
        }
        System.out.println("Average Rating: " + calculateAverageRating());
    }

    // Main method to test the class
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();

        myRestaurant.addItem("Burger", 8.99, 4.5);
        myRestaurant.addItem("Pizza", 12.50, 4.8);
        myRestaurant.addItem("Salad", 7.25, 4.2);

        myRestaurant.displayMenu();

        myRestaurant.removeItem("Pizza");

        myRestaurant.displayMenu();
    }
}
