    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circle;

/**
 *
 * @author Administrator
 */
public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Circumference: " + myCircle.getCircumference());

        // Modify radius
        myCircle.setRadius(7.0);
        System.out.println("\nAfter changing radius:");
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Circumference: " + myCircle.getCircumference());

    }
}
