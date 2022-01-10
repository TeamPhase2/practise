package Java.FuctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EmployeeMain extends Employee{

	public EmployeeMain(String id, String name, long salary, List<Address> addressList) {
		super(id, name, salary, addressList);
		
	}
	public static void main(String[] args) {
		Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
	    List<Employee> employeeList= 
	     Arrays.asList(new Employee("2345", "Vamsi", 5000, null));
	                  		       
	    List<String> empNameList=convertEmpListToNamesList(employeeList, funcEmpToString);
	    empNameList.forEach(System.out::println);
	}
	public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
	   List<String> empNameList=new ArrayList<String>(); 
	   for(Employee emp:employeeList){
	     empNameList.add(funcEmpToString.apply(emp));
	   }
	   
	   return empNameList;
	   
	}

}
