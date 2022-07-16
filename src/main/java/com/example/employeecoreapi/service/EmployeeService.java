package com.example.employeecoreapi.service;

import com.example.employeecoreapi.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    void createEmployee(EmployeeModel employeeModel);
    List<EmployeeModel> getAllEmployee();
    EmployeeModel getEmployee(String employeeId);
    void updateEmployee(String employeeId, EmployeeModel employeeModel);
    void deleteEmployee(String employeeId);
}
