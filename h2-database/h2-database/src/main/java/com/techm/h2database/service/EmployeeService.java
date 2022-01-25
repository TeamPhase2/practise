package com.techm.h2database.service;


import com.techm.h2database.entity.Employee;
import com.techm.h2database.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Value("${employee.employeelist.details}")
    private List<String> employeeNameList;

    public List<Employee> stringListToEmployeeListConversion() {
        List<Employee> employeeList = new ArrayList<>();
        for (String s : employeeNameList) {
            Employee e = new Employee();
            e.setName(s);
            employeeList.add(e);
        }
        return employeeList;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> saveOrUpdate() {
        List<Employee> employeeList = new ArrayList<>();
        employeeNameList.stream().map(e -> employeeList.add(new Employee(null, e,"Hyderabad","25000"))).collect(Collectors.toList());
        employeeRepository.saveAll(employeeList).forEach(employee1 -> employeeRepository.save(employee1));
        return employeeList;
    }
}
