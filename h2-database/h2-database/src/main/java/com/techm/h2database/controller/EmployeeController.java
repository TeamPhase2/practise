package com.techm.h2database.controller;

import com.techm.h2database.entity.Employee;
import com.techm.h2database.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public List<Employee> saveEmployee() {
        return employeeService.saveOrUpdate();
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAll() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

}
