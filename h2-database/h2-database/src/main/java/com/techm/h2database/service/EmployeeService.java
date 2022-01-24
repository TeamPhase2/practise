package com.techm.h2database.service;


import com.techm.h2database.entity.Employee;
import com.techm.h2database.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);

    }

    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
      employeeRepository.findAll().forEach(employees -> employeeList.add(employees));
      return employeeList;
    }
}
