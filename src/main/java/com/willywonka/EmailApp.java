package com.willywonka;

import utilities.CSV;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmailApp {


    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to Wonka's com.willywonka.Employee Registration!\nPlease enter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = in.nextLine();
        */
        String filePathToRead = "/Users/benita.nou/Projects/email-database/src/main/resources/fileToRead.txt";
        String filePathToWrite = "/Users/benita.nou/Projects/email-database/src/main/resources/fileToWrite.txt";
        List<String[]> prospectEmployees = CSV.readAndWrite(filePathToRead, filePathToWrite);
        List<Employee> officialEmployees = new LinkedList<>();
        for (String[] employee : prospectEmployees) {
            String firstName = employee[0];
            String lastName = employee[1];
            String dept = employee[2];
            officialEmployees.add(new Employee(firstName, lastName, dept));
        }

        for (Employee employee : officialEmployees) {
            System.out.println(employee.showInfo());
        }

    }
}






//        Employee employee1 = new Employee(firstName, lastName);
//        System.out.println(employee1);
//        employee1.setEmployeeID();
//        System.out.println("Your EMPLOYEE ID is: " + employee1.getEmployeeID());
//
//
//        String dept = "";
//
//        System.out.println("CURRENT DEPARTMENTS:\n 1) Chocolate\n 2) Fizzy-Lifting-Drink\n 3) Wonkavator\n 4) None ");
//        System.out.println("Please select the corresponding numerical code for your department: ");
//        int deptSelection = in.nextInt();
//        if (deptSelection == 1) {
//            dept = "Chocolate";
//        } else if (deptSelection == 2) {
//            dept = "Fizzy-Lifting-Drink";
//        } else if (deptSelection == 3) {
//            dept = "Wonkavator";
//        } else {
//            dept = "";
//        }
//
//        employee1.setDept(dept);
//
//        Email email = new Email();
//        email.setEmail(employee1);
//        email.setPassword();
//        System.out.println("Your EMAIL is: " + email.getEmail());
//        System.out.println("Your PASSWORD is: " + email.getPassword());







