package Java.FuctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AddressMain extends Address{

	public AddressMain(String id, String state, String city) {
		super(id, state, city);
		
	}
	public static void main(String[] args) {
		Function<Address, String> funcAddressToString= (Address a)-> {return a.getAddress();};
	    List<Address> AddressList= 
	    Arrays.asList(new Address("3", "Karnataka","Bangalore"),
	    		       new Address("4", "Tamilnadu", "Chennai"));
	    
	    List<String> AddressNameList=AddressNameList(AddressList, funcAddressToString);
	    AddressNameList.forEach(System.out::println);
	}
	public static List<String> AddressNameList(List<Address> AddressList, Function<Address, String> funcAddressToString){
	   List<String> AddressNameList=new ArrayList<String>(); 
	   for(Address Address:AddressList){
	     AddressNameList.add(funcAddressToString.apply(Address));
	   }
	   
	   return AddressNameList;
	}

}
