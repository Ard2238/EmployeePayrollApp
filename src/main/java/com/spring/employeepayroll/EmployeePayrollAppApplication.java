package com.spring.employeepayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeePayrollAppApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Payroll App");
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
    }

}
