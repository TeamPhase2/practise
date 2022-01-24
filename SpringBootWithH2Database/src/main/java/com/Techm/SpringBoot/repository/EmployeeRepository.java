package com.Techm.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Techm.SpringBoot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
