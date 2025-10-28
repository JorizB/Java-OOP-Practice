/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.airplane;

/**
 *
 * @author Administrator
 */
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airplane {
     private final String flightNumber;
    private final String destination;
    private LocalTime departureTime;
    private boolean delayed;

    // Constructor
    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    // Get flight status
    public String getStatus() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        if (delayed) {
            return "Flight " + flightNumber + " to " + destination + " is delayed. New departure time: " + departureTime.format(formatter);
        } else {
            return "Flight " + flightNumber + " to " + destination + " is on time. Departure: " + departureTime.format(formatter);
        }
    }

    // Delay the flight by given minutes
    public void delay(int minutes) {
        departureTime = departureTime.plusMinutes(minutes);
        delayed = true;
    }

    // Main method to test
    public static void main(String[] args) {
        Airplane flight = new Airplane("AA101", "New York", LocalTime.of(14, 30));
        System.out.println(flight.getStatus());

        // Delay the flight by 45 minutes
        flight.delay(45);
        System.out.println(flight.getStatus());
    }
}
