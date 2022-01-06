package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String args[]) {
        List<Employee> list = new ArrayList<>();
        list.add(new EmpolyeeBuilder().setId(1).setName("Pushpa").setAddress("Hyderabad").setColor("pink").build());
        list.add(new EmpolyeeBuilder().setId(1).setName("Vijaya").setAddress("Hyderabad").setColor("pink").build());
        list.add(new EmpolyeeBuilder().setId(1).setName("Akhil").setAddress("chennai").setColor("Brown").build());
        list.add(new EmpolyeeBuilder().setId(1).setName("Pranith").setAddress("chennai").setColor("Black").build());
        list.add(new EmpolyeeBuilder().setId(1).setName("Vinay").setAddress("Hyderabad").setColor("Blue").build());

        //Find the given employee address belongs to Hyderabad or not
        Predicate<Employee>predicate=t->t.getAddress().equalsIgnoreCase("hyderabad");
        list.stream().filter(predicate).map(Employee::getName).forEach(System.out::println);
        //a list of colors and find the given color is in the list or not


        System.out.println("--------------------------------------------------------------------------------------");

        Predicate<Employee>predicate1=t->t.getColor().equalsIgnoreCase("pink");
        list.stream().filter(predicate1).map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);

    }
}