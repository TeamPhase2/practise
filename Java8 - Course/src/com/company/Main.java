package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList= new ArrayList<>();

        employeeList.add(new Employee(101,"Swathi",24000,"Hyderabad"));
        employeeList.add(new Employee(102,"Pavani",23000,"Vijayawada"));
        employeeList.add(new Employee(103,"Pavan",23000,"Tirupathi"));
        employeeList.add(new Employee(104,"Vijaya",25000,"Banglore"));
        employeeList.add(new Employee(105,"Latha",26000,"Chennai"));
        employeeList.add(new Employee(106,"Rani",26000,"Hyderabad"));
        employeeList.add(new Employee(107,"Ravali",28000,"Chennai"));

        System.out.println( "" );

        employeeList.stream().forEach(System.out :: println);
        List<Employee> salary = employeeList.stream().filter(employee -> employee.getSalary()<26000).collect(Collectors.toList());
        System.out.println(salary);




        Map<Integer,String>  employeeMap =
                employeeList.stream()
                        .collect(Collectors.toMap(p->p.getId(), p->p.getName()));

        System.out.println(employeeMap);

        double sumOfSalaries = employeeList.stream().collect(Collectors.summingDouble(emp ->emp.getSalary()));
        System.out.println("Sum of Salaries : " + sumOfSalaries);

        Employee min = employeeList.stream().min((emp1,emp2) -> emp1.getSalary() > emp2.getSalary()?1:-1).get();
        System.out.println(min);

        Employee max = employeeList.stream().max((emp1,emp2) -> emp1.getSalary() > emp2.getSalary()?1:-1).get();
        System.out.println(max);

        Optional<String> result =employeeList.stream().map(employee -> employee.getName()).findAny();
        System.out.println(result);

        Optional<Double> result2 =employeeList.stream().map(employee -> employee.getSalary()).findAny();
        System.out.println(result2);

        Optional<Employee> result1 =employeeList.stream().findFirst();
        System.out.println(result1);
    }
}
