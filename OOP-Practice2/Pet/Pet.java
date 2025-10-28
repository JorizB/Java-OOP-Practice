/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pet;

/**
 *
 * @author Administrator
 */
public class Pet {
    protected String name;
    protected String species;
    protected int age; // in years

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Display pet details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    // Calculate age in human years (basic approximation)
    public int calculateHumanAge() {
        return age * 7; // simple formula
    }
}

// Subclass: Dog
class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
        System.out.println("Human Age Equivalent: " + calculateHumanAge() + " years");
    }
}

// Subclass: Bird
class Bird extends Pet {
    private double wingspan; // in cm

    public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: " + wingspan + " cm");
        System.out.println("Human Age Equivalent: " + calculateHumanAge() + " years");
    }
}

// Test class
public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Ball");
        Bird bird = new Bird("Tweety", 2, 25);

        dog.displayDetails();
        System.out.println();
        bird.displayDetails();

    }
}
