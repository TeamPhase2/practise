import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PracticeConsumer {
    public static void main(String args[]) {


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("123456", "Akhil", 100000L));
        employeeList.add(new Employee("879787", "Anusha", 200000L));
        employeeList.add(new Employee("678678", "vikram", 300000L));


        Consumer<List<Employee>> listConsumer = employees -> {

            employeeList.stream().forEach(System.out::println);

        };
        listConsumer.accept(employeeList);
    }
}
