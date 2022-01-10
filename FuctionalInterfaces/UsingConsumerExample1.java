package Java.FuctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingConsumerExample1 {
	
	public static void main(String[] args) {
		@Test
	        
			List<String> cities = Arrays.asList("Sydney", "New York", "London");

		    Consumer<List<String>> convertToUpperCase = list -> {
		        for(int i=0; i< list.size(); i++){
		            list.set(i, list.get(i).toUpperCase());
		        }
		    };
		    
		    Consumer<List<String>> printCities = list -> list.stream().forEach(System.out::println);

		    convertToUpperCase.andThen(printCities).accept(cities);
		    
	} 

}


