/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dogproject;

/**
 *
 * @author Administrator
 */
public class Dogproject {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        System.out.println("Dog 1: " + dog1.getName() + " - " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " - " + dog2.getBreed());
    }
}
