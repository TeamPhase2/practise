package com.company;

import java.util.*;
import java.util.function.Consumer;

public class PracticeConsumer {

    public static void main(String args[]){

        Address address1 = new Address("1","Banglore","Karnataka");
        Address address2 = new Address("2","Hyderabad","Telangana");
        Address address3 = new Address("3","Tirupathi","AndhraPradesh");

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("1234","Ajay",10000L, Collections.singletonList(address1)));
        employeeList.add(new Employee("2345","Arun",8000L, Collections.singletonList(address2)));
        employeeList.add(new Employee("3456","Vijay",10000L, Collections.singletonList(address3)));

         Consumer<List<Employee>> addressConsumer= employees -> {
             Optional<Employee> employeeOptional = employeeList.stream().findFirst();
             if(employeeOptional.isPresent()){
                 System.out.println(employeeOptional.get().getAddressList());
             }
         };
         addressConsumer.accept(employeeList);
    }
}
