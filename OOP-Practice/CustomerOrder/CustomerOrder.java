/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.customerorder;

/**
 *
 * @author Administrator
 */
import java.time.LocalDate;

public class CustomerOrder {
     protected String orderID;
    protected String customer;
    protected LocalDate orderDate;

    public CustomerOrder(String orderID, String customer, LocalDate orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: OnlineOrder
class OnlineOrder extends CustomerOrder {
    private final String deliveryAddress;
    private final String trackingNumber;
    private String trackingStatus;

    public OnlineOrder(String orderID, String customer, LocalDate orderDate,
                       String deliveryAddress, String trackingNumber) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Processing";
    }

    // Calculate estimated delivery time based on address (dummy logic)
    public int calculateDeliveryDays() {
        return deliveryAddress.length() % 7 + 2; // just for demonstration
    }

    // Update tracking status
    public void updateTrackingStatus(String status) {
        trackingStatus = status;
        System.out.println("Tracking updated: " + trackingStatus);
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Days: " + calculateDeliveryDays());
    }
}

// Test class
public class CustomerOrderTest {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder("O101", "Alice", LocalDate.now(),
                "123 Main St, City", "TRK12345");

        order.displayOrderDetails();
        order.updateTrackingStatus("Shipped");
        order.displayOrderDetails();

    }
}
