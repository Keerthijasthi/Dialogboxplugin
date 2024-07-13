package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee added successfully";
    }

    @GetMapping("/list")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
