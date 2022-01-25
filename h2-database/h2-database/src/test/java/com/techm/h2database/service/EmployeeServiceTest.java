package com.techm.h2database.service;

import com.techm.h2database.entity.Employee;
import com.techm.h2database.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;


    @Test
    public void getEmployeeByIdWhenIdIsValid() {
        Employee employee = new Employee();
        when(employeeRepository.findById(1)).thenReturn(Optional.of(employee));

        Employee exceptedEmployee = employeeService.getEmployeeById(1);
        Assertions.assertEquals(exceptedEmployee.getId(),employee.getId());
    }

    @Test
    public void getAllEmployeesWhenEmployeeResponseIsValid(){
        List<Employee> employeeList = new ArrayList<>();
        when(employeeRepository.findAll()).thenReturn(employeeList);

        List<Employee> exceptedEmployeeList = employeeService.getAllEmployees();
        Assertions.assertEquals(exceptedEmployeeList,employeeList);
    }

}