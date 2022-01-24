package com.techm.h2database.controller;

import com.techm.h2database.entity.Employee;
import com.techm.h2database.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Value("${employee.employeelist.details}")
    private String stringList;

    public Employee map(){
        String[] tokens = stringList.split(",");
        Employee result = new Employee(Integer.parseInt(tokens[0]),tokens[1],tokens[2],tokens[3]);
        return result;
    }

    @PostMapping("/saveEmployee")
    public List<Employee> addEmployee(@RequestBody Employee employee){
        Employee employees = map();
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(employeeService.saveEmployee(employee));
        employeeList.add(employeeService.saveEmployee(employees));
         return employeeList ;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }
}
