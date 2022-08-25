package com.example.employeecoreapi.service;

import com.example.employeecoreapi.model.EmployeeRequest;
import com.example.employeecoreapi.model.EmployeeResponse;

import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);

    EmployeeResponse updateEmployee(EmployeeRequest employeeRequest);

    EmployeeResponse getEmployeeById(String employeeId);

    List<EmployeeResponse> getAllEmployees();

    void deleteEmployeeById(String employeeId);

}
