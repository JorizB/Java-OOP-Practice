/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservation;

/**
 *
 * @author Administrator
 */
import java.time.LocalDate;

public class Reservation {
   protected String reservationID;
    protected String customerName;
    protected LocalDate date;

    public Reservation(String reservationID, String customerName, LocalDate date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
    }

    public void displayReservation() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
    }
}

// Subclass: ResortReservation
class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String reservationID, String customerName, LocalDate date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
    }

    public void modifyRoom(int newRoom) {
        roomNumber = newRoom;
        System.out.println("Room updated to: " + roomNumber);
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Room Number: " + roomNumber);
    }
}

// Subclass: RailwayReservation
class RailwayReservation extends Reservation {
    private String seatNumber;

    public RailwayReservation(String reservationID, String customerName, LocalDate date, String seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
    }

    public void modifySeat(String newSeat) {
        seatNumber = newSeat;
        System.out.println("Seat updated to: " + seatNumber);
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Seat Number: " + seatNumber);
    }
}

// Test class
public class ReservationTest {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation("R101", "Bob", LocalDate.of(2025, 12, 5), 305);
        RailwayReservation railway = new RailwayReservation("T202", "Carol", LocalDate.of(2025, 12, 6), "B12");

        resort.displayReservation();
        resort.modifyRoom(310);

        railway.displayReservation();
        railway.modifySeat("B15");
    }
}
