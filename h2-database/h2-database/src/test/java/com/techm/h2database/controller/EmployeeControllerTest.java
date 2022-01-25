package com.techm.h2database.controller;

import com.techm.h2database.entity.Employee;
import com.techm.h2database.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    @Test
    public void saveEmployeeAndReturnEmployeeList() {
        List<Employee> employeeList=new ArrayList<>();
        when(employeeService.saveOrUpdate()).thenReturn(employeeList);

        List<Employee> exceptedEmployeeList = employeeController.saveEmployee();
        Assertions.assertEquals(exceptedEmployeeList,employeeList);
    }

    @Test
    public void getAllEmployeesWhenValidResponse() {
        List<Employee> employeeList=new ArrayList<>();
        when(employeeService.getAllEmployees()).thenReturn(employeeList);
        List<Employee> exceptedEmployeeList = employeeController.getAll();
        Assertions.assertEquals(exceptedEmployeeList,employeeList);
    }

    @Test
    public void getElementByIdWhenValidIdIsGiven(){
        Employee employee= new Employee();
        when(employeeService.getEmployeeById(1)).thenReturn(employee);

        Employee actualEmployee = employeeController.getEmployee(1);
        Assertions.assertEquals(actualEmployee.getId(),employee.getId());
    }
}