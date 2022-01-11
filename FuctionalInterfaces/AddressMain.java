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
	    List<Address> addressList= 
	    Arrays.asList(new Address("3", "Karnataka","Bangalore"),
	    		       new Address("4", "Tamilnadu", "Chennai"));
	    
	    List<String> addressNameList=addressNameList(addressList, funcAddressToString);
	    addressNameList.forEach(System.out::println);
	}
	public static List<String> addressNameList(List<Address> addressList, Function<Address, String> funcAddressToString){
	   List<String> addressNameList=new ArrayList<String>(); 
	   for(Address address:addressList){
	     addressNameList.add(funcAddressToString.apply(address));
	   }
	   
	   return addressNameList;
	}

}
