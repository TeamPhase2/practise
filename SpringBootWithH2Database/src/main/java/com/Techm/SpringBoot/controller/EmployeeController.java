package com.Techm.SpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Techm.SpringBoot.entity.Employee;
import com.Techm.SpringBoot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
    @Autowired
	private EmployeeRepository repository;
    
    @Value("${employee.employeeList.details}")
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
    
    @PostMapping("/saveEmployee")
    public List<Employee>saveEmployee(@RequestBody Employee employee) {
    	List<Employee> employeeList = stringListToEmployeeListConversion();
        List<Employee> employeeList1 = new ArrayList<>();
        for (Employee e : employeeList
        ) {
            employeeList1.add(repository.save(e));
        }
        employeeList1.add(repository.save(employee));
        return employeeList1;
    }
    
    @GetMapping("/getAllEmployees")
    public List<Employee> getAll() {
		return repository.findAll();	 
    }
    
    public Employee getStudentById(int id) {
        return repository.findById(id).get();
    }	
}
