/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.course;

/**
 *
 * @author Administrator
 */
public class CourseTest {
    protected String courseName;
    protected String instructor;
    protected int credits;

    // Constructor
    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    private final String platform;
    private final int duration; // in hours

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    // Method to check eligibility for certificate
    public boolean isEligibleForCertificate() {
        return duration >= 40; // assume courses longer than 40 hours are eligible
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Eligible for Certificate: " + (isEligibleForCertificate() ? "Yes" : "No"));
    }
}

// Main class to test
public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("Data Structures", "Dr. Smith", 3);
        course.displayCourseDetails();

        System.out.println("\n--- Online Course ---\n");

        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", "Prof. Johnson", 4, "Coursera", 45);
        onlineCourse.displayCourseDetails();
    }
}
