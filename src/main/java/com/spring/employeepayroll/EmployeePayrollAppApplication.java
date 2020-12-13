package com.spring.employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Payroll App");
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee Payroll Application started in {} environment", context.getEnvironment().getProperty("environment"));
    }
}

