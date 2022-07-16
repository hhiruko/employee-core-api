package com.example.employeecoreapi.service;

import com.example.employeecoreapi.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private static final HashMap<String, EmployeeModel> employeeMap = new HashMap<>();

    static {
        EmployeeModel employeeModel1 = new EmployeeModel(UUID.randomUUID().toString(), "Hiro", "Nakamura",
                "EXAMPLE CO.", "Engineer", "example1@gmail.com", 123000);
        EmployeeModel employeeModel2 = new EmployeeModel(UUID.randomUUID().toString(), "Hanamizaka", "Nakamura",
                "EXAMPLE CO.", "Engineer", "example2@gmail.com", 456000);
        EmployeeModel employeeModel3 = new EmployeeModel(UUID.randomUUID().toString(), "Hiro", "Nobunaga",
                "EXAMPLE CO.", "Engineer", "example3@gmail.com", 70000);

        employeeMap.put(employeeModel1.getEmployeeId(), employeeModel1);
        employeeMap.put(employeeModel2.getEmployeeId(), employeeModel2);
        employeeMap.put(employeeModel3.getEmployeeId(), employeeModel3);
    }

    @Override
    public void createEmployee(EmployeeModel employeeModel) {
        employeeModel.setEmployeeId(UUID.randomUUID().toString());
        employeeMap.put(employeeModel.getEmployeeId(), employeeModel);
    }

    @Override
    public List<EmployeeModel> getAllEmployee() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public EmployeeModel getEmployee(String employeeId) {
        return employeeMap.get(employeeId);
    }

    @Override
    public void updateEmployee(String employeeId, EmployeeModel employeeModel) {
        employeeModel.setEmployeeId(employeeId);
        employeeMap.put(employeeId, employeeModel);
    }

    @Override
    public void deleteEmployee(String employeeId) {
        employeeMap.remove(employeeId);
    }
}
