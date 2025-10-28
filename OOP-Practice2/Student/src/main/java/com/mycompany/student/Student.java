/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final String grade;
    private final List<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) { courses.add(course); }
    public void removeCourse(String course) { courses.remove(course); }

    public void displayCourses() {
        System.out.println(name + "'s courses: " + courses);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        student.addCourse("Math");
        student.addCourse("Science");
        student.displayCourses();

        student.removeCourse("Math");
        student.displayCourses();
    }
}
