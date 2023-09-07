package com.willywonka;

import java.util.Random;

public class Employee {

    private String firstName;
    private String lastName;
    private String employeeID;
    private String dept;


    public Employee(String firstName, String lastName, String dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        setEmployeeID();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID() {
        this.employeeID = generateAndSetEmployeeID();
    }

    private String generateAndSetEmployeeID() {
        String id = "";
        Random random = new Random();
        long randomNum = Math.abs(random.nextLong());
        id = String.valueOf(randomNum).substring(0,5);
        return id;
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public String showInfo() {
        return firstName + " " + lastName + ", Dept: " + dept;
    }

    @Override
    public String toString() {
        return "Welcome, " + firstName + " " + lastName + "!" + "\nYour employee ID is: " + employeeID + "\n";
    }
}

