package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionTest {
    public static void main(String args[]) {
        //Address

         Address address1=new AddressBuilder().setId(12).setCity("Hyderbad").setState("Telengana").build();
        Address address2=new AddressBuilder().setId(13).setCity("Chennai").setState("Tamilanadu").build();
       Address address3=new AddressBuilder().setId(14).setCity("Chennai").setState("Tamilanadu").build();
      Address address4=new AddressBuilder().setId(15).setCity("Banglore").setState("Karnataka").build();

        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add(new EmpolyeeBuilder().setId("1").setName("ajay").setAddress(address1).setSalary(200000L).build());
        employeeList.add(new EmpolyeeBuilder().setId("2").setName("Vamsi").setAddress(address2).setSalary(300000L).build());
        employeeList.add(new EmpolyeeBuilder().setId("3").setName("Chandhu").setAddress(address3).setSalary(400000L).build());
        employeeList.add(new EmpolyeeBuilder().setId("4").setName("Vijay").setAddress(address4).setSalary(500000L).build());

        Function<Employee,Boolean >function=employee -> {
          return  employee.getAddress().getCity().equalsIgnoreCase("chennai");

        };

       List<Employee>citylist= employeeList.stream().filter(function::apply).collect(Collectors.toList());
        for (Employee e:citylist)
             {
                 System.out.println("EmployeeName---"+e.getName()+"   "+"EmployeeSalary->"+e.getSalary()+"  "+" State->"+e.getAddress().getState());
        }

        };


    }
