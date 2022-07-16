package com.example.employeecoreapi.controller;

import com.example.employeecoreapi.model.EmployeeModel;
import com.example.employeecoreapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeModel employeeModel){
        employeeService.createEmployee(employeeModel);
        return new ResponseEntity<String>("Successfully created.", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<EmployeeModel> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{employeeId}")
    public EmployeeModel getEmployee(@PathVariable String employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<String> updateEmployee(@PathVariable String employeeId,
                                                 @Valid @RequestBody EmployeeModel employeeModel){
        employeeService.updateEmployee(employeeId, employeeModel);
        return new ResponseEntity<String >("Successfully updated.", HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String employeeId){
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<String >("Successfully deleted.", HttpStatus.OK);
    }
}
