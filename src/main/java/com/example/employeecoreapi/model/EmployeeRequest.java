package com.example.employeecoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    private String employeeId;
    @NotNull(message = "Name cannot be empty!")
    private String name;
    @NotNull(message = "Surname cannot be empty!")
    @Size(min = 2, max = 16, message = "Surname must be longer than 2 symbols, and shorter than 16 symbols!")
    private String surname;
    private String company;
    private String position;
    @Email(message = "Incorrect email format!")
    private String email;
    private double salary;
}
