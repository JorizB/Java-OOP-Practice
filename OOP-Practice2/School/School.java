/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.school;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;

public class School {
    private List<String> students;
    private List<String> teachers;
    private List<String> classes;

    // Constructor
    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    // Methods to add students and teachers
    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println("Student " + studentName + " added.");
    }

    public void addTeacher(String teacherName) {
        teachers.add(teacherName);
        System.out.println("Teacher " + teacherName + " added.");
    }

    // Methods to remove students and teachers
    public void removeStudent(String studentName) {
        if (students.remove(studentName)) {
            System.out.println("Student " + studentName + " removed.");
        } else {
            System.out.println("Student " + studentName + " not found.");
        }
    }

    public void removeTeacher(String teacherName) {
        if (teachers.remove(teacherName)) {
            System.out.println("Teacher " + teacherName + " removed.");
        } else {
            System.out.println("Teacher " + teacherName + " not found.");
        }
    }

    // Method to create a class
    public void createClass(String className) {
        classes.add(className);
        System.out.println("Class " + className + " created.");
    }

    // Method to display school information
    public void displaySchoolInfo() {
        System.out.println("\nSchool Information:");
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }

    // Main method to test the class
    public static void main(String[] args) {
        School mySchool = new School();

        mySchool.addStudent("Alice");
        mySchool.addStudent("Bob");

        mySchool.addTeacher("Mr. Smith");
        mySchool.addTeacher("Ms. Johnson");

        mySchool.createClass("Math");
        mySchool.createClass("Science");

        mySchool.displaySchoolInfo();

        mySchool.removeStudent("Alice");
        mySchool.removeTeacher("Mr. Smith");

        mySchool.displaySchoolInfo();
    }
}
