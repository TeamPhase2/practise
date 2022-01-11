package Java.FuctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingConsumerExample1 {

	public static void main(String[] args) {
	
		List<String> Cities = Arrays.asList("Sydney", "New York", "London");
		
		Consumer<List<String>> printCities = CitiesList -> Cities
				.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);
				
				printCities.accept(Cities);
	}

}


