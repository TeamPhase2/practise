package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new EmpolyeeBuilder().setId(1).setName("Pushpa").setAddress("Hyderabad").setColor("pink").build());
        employeeList.add(new EmpolyeeBuilder().setId(1).setName("Vijaya").setAddress("Hyderabad").setColor("pink").build());
        employeeList.add(new EmpolyeeBuilder().setId(1).setName("Akhil").setAddress("chennai").setColor("Brown").build());
        employeeList.add(new EmpolyeeBuilder().setId(1).setName("Pranith").setAddress("chennai").setColor("Black").build());
        employeeList.add(new EmpolyeeBuilder().setId(1).setName("Vinay").setAddress("Hyderabad").setColor("Blue").build());

        //Find the given employee address belongs to Hyderabad or not
        Predicate<Employee>addresspredicate=t->t.getAddress().equalsIgnoreCase("hyderabad");
        list.stream().filter(addresspredicate).map(Employee::getName).forEach(System.out::println);
        //a list of colors and find the given color is in the list or not


        System.out.println("--------------------------------------------------------------------------------------");

        Predicate<Employee>colorPredicate=t->t.getColor().equalsIgnoreCase("pink");
        list.stream().filter(colorPredicate).map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);

    }
}
