package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeFunction {
    public static void main(String args[]) {

        Address address1 = new Address("1", "Hyderabad", "Telangana");
        Address address2 = new Address("2", "Chennai", "Tamilnadu");

        List<Address> addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("1234", "Ajay", 10000L,
                Collections.singletonList(address1)));

        employeeList.add(new Employee("2345", "Vamsi", 5000L,
                Collections.singletonList(address2)));

         // employees whose salary is greater than 5000------

        Function<Employee, Boolean> salaryGreaterthan5000 = employees -> {
            return employees.getSalary() > 5000L;
        };
        
       List<Employee> employeesList = employeeList.stream().filter(salaryGreaterthan5000::apply).collect(Collectors.toList());

        System.out.println(" Employee whose salary is greater than 5000L : " +
                employeesList);

        Function<List<Employee>, List<String>> citiesList = employees -> employees.stream()
                .map(Employee::getAddressList)
                .flatMap(List::stream)
                .map(Address::getCity)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List of cities are..");
        citiesList.apply(employeeList).forEach(System.out::println);
    }
}

