import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticeFunction {
    public static void main(String args[]) {


        List<Employee> employeeList = new ArrayList<>();
        List<Address> addressList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId("3214");
        employee.setName("Pranith");
        employee.setSalary(12344L);
        Address address = new Address();
        address.setCity("Hyderbad");
        address.setState("Telengana");

        address.setId("4");
        addressList.add(address);
        employee.setAddressList(Collections.singletonList(address));
        employeeList.add(employee);
        Employee employee1 = new Employee();
        employee1.setId("4561");
        employee1.setName("Prajwal");
        employee1.setSalary(23000L);
        Address address1 = new Address();
        address1.setCity("Chennai");
        address1.setState("Tamilanadu");
        address1.setId("5");
        addressList.add(address1);

        employee1.setAddressList(Collections.singletonList(address1));
        employeeList.add(employee1);

//write a function to get an employee whose address id is 4.

        Predicate<Employee> employeePredicate = e-> {
            return e.getAddressList().stream().anyMatch(a -> a.getId().equals("4"));
        };
        Function<List<Employee>,List<Employee>> employListFunction = employees -> {
            return employeeList.stream().filter(employeePredicate).collect(Collectors.toList());
        };
        employListFunction.apply(employeeList).forEach(System.out::println);

//write a function to get first four characters of a given String

        String text="Pranith";
        Function<String,String> stringStringFunction=s->{
            return  text.substring(0, 4) ;
        };
        System.out.println(stringStringFunction.apply(text));
    }

    }
}