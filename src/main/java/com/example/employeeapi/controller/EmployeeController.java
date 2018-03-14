package com.example.employeeapi.controller;

import com.example.employeeapi.datasource.EmployeeRepository;
import com.example.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    ResponseEntity getEmployees() {
        List<Employee> employees = employeeRepository.getAllEmployees();

        if (employees == null || employees.size() == 0) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
        }

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    ResponseEntity getEmployee(@PathVariable("id") int id) {
        Employee employee = employeeRepository.getEmployee(id);

        if (employee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
