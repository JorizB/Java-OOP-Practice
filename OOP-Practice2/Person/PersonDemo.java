/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Person;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

class Person {
    String name;
    int age; 
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    
    void displayInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
    
    }
  
}
   public class PersonDemo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    
        System.out.print("Alice");
        String name1 = input.nextLine();
        System.out.print("25");
        int age1 = input.nextInt();
        input.nextLine();

        System.out.print("Bob");
        String name2 = input.nextLine();
        System.out.print("30");
        int age2 = input.nextInt();
    
        Person person1 = new Person(name1, age1);   
        Person person2 = new Person(name1, age2);
        
        System.out.println("--- Person Details---");
        
        person1.displayInfo();
        person2.displayInfo();
        
    }
   }