package com.spring.employeepayroll.dto;

public class EmployeePayrollDTO {
    private String name;
    private long salary;

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
