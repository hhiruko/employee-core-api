package com.example.employeecoreapi.controller;

import com.example.employeecoreapi.model.EmployeeRequest;
import com.example.employeecoreapi.model.EmployeeResponse;
import com.example.employeecoreapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.createEmployee(employeeRequest);
    }

    @PutMapping
    public EmployeeResponse updateEmployee(@RequestParam String employeeId, @RequestBody EmployeeRequest employeeRequest){
        employeeRequest.setEmployeeId(employeeId);
        return employeeService.updateEmployee(employeeRequest);
    }

    @GetMapping
    public EmployeeResponse getEmployeeById(@RequestParam String employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping("/all")
    public List<EmployeeResponse> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping
    public void deleteEmployee(@RequestParam String employeeId){
        employeeService.deleteEmployeeById(employeeId);
    }
}
