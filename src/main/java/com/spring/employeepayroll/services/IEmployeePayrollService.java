package com.spring.employeepayroll.services;

import com.spring.employeepayroll.dto.EmployeePayrollDTO;
import com.spring.employeepayroll.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployeePayrollData(int empId);
}
