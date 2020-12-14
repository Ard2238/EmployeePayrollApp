package com.spring.employeepayroll.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Invalid Employee Name")
    public String name;

    @Min(value = 5000, message = "Minimum salary should be more than 5000")
    public long salary;

    public EmployeePayrollDTO(String name, long salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
