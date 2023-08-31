package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Locale;

public class Employee {

    String name, jobTitle;
    double salary;
    LocalDate hireDate;

    public Employee(String name, String jobTitle, double salary,LocalDate hireDate){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void raisedSalary(double percentage){
        salary = salary + salary * percentage / 100;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate){
        this.hireDate = hireDate;
    }
    public int calculateYearOfService(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void getDetails(){
        System.out.println("name of employee " +getName());
        System.out.println("jobTitle of employee " +getJobTitle());
        System.out.println("salary of employee " +getSalary());
    }
    public static void main(String[] args) {
        Employee employee = new Employee("zohaib", "technical superVisor", 25000,LocalDate.parse("2021-04-23"));
        Employee employee1 = new Employee("noman", "custom officer", 30000,LocalDate.parse("2020-02-21"));
        Employee employee2 = new Employee("zulqarnain", "operation head", 50000,LocalDate.parse("2010-03-12"));
        System.out.println("Employee details\n");
        employee.getDetails();
        employee1.getDetails();
        employee2.getDetails();


        employee.raisedSalary(12);
        employee1.raisedSalary(12);
        employee2.raisedSalary(12);


        System.out.println("\nAfter raising salary:");
        System.out.println("\n12% for 'zohaib':");
        employee1.getDetails();
        System.out.println("\n12% for 'noman':");
        employee2.getDetails();
        System.out.println("\n12% for 'zulqarnain':");
        employee2.getDetails();

        System.out.println("Year of Experience " +employee1.calculateYearOfService());
        System.out.println("Year of Experience " +employee2.calculateYearOfService());
        System.out.println("Year of Experience " +employee.calculateYearOfService());

    }

}
