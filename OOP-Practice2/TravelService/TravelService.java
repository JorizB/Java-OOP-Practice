/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travelservice;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;

public class TravelService {
     private final List<String> flights;
    private final List<String> hotels;
    private final List<String> bookings;

    // Constructor
    public TravelService() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
        bookings = new ArrayList<>();

        // Sample data
        flights.add("Flight: NYC -> LA");
        flights.add("Flight: LA -> Tokyo");
        flights.add("Flight: Paris -> London");

        hotels.add("Hotel: Grand NYC");
        hotels.add("Hotel: Tokyo Inn");
        hotels.add("Hotel: London Suites");
    }

    // Search flights
    public List<String> searchFlights(String query) {
        List<String> results = new ArrayList<>();
        for (String flight : flights) {
            if (flight.toLowerCase().contains(query.toLowerCase())) {
                results.add(flight);
            }
        }
        return results;
    }

    // Search hotels
    public List<String> searchHotels(String query) {
        List<String> results = new ArrayList<>();
        for (String hotel : hotels) {
            if (hotel.toLowerCase().contains(query.toLowerCase())) {
                results.add(hotel);
            }
        }
        return results;
    }

    // Book a reservation
    public void bookReservation(String item) {
        if ((flights.contains(item) || hotels.contains(item)) && !bookings.contains(item)) {
            bookings.add(item);
            System.out.println("Successfully booked: " + item);
        } else if (bookings.contains(item)) {
            System.out.println(item + " is already booked.");
        } else {
            System.out.println(item + " not found.");
        }
    }

    // Cancel a reservation
    public void cancelReservation(String item) {
        if (bookings.remove(item)) {
            System.out.println("Reservation canceled: " + item);
        } else {
            System.out.println("No booking found for: " + item);
        }
    }

    // Display all bookings
    public void displayBookings() {
        System.out.println("\nYour Bookings:");
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            for (String booking : bookings) {
                System.out.println("- " + booking);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        TravelService travelService = new TravelService();

        System.out.println("Searching for flights with 'NYC': " + travelService.searchFlights("NYC"));
        System.out.println("Searching for hotels with 'Tokyo': " + travelService.searchHotels("Tokyo"));

        travelService.bookReservation("Flight: NYC -> LA");
        travelService.bookReservation("Hotel: Tokyo Inn");

        travelService.displayBookings();

        travelService.cancelReservation("Flight: NYC -> LA");

        travelService.displayBookings();

    }
}
