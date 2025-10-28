/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author Administrator
 */
public class Employee {
     private final String name;
    private final String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getJobTitle() { return jobTitle; }
    public double getSalary() { return salary; }

    public double calculateSalary(double bonusPercent) {
        return salary + (salary * bonusPercent / 100);
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer", 50000);
        System.out.println(emp.getName() + " - " + emp.getJobTitle() + " - Salary: " + emp.getSalary());
        System.out.println("Salary after 10% bonus: " + emp.calculateSalary(10));
        emp.updateSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());

    }
}
