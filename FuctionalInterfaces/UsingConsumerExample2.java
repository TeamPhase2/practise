package Java.FuctionalInterfaces;

import java.util.function.Consumer;

public class UsingConsumerExample2 {
	
	public static void main(String[] args) {
		
        
	    Consumer<String> convertStringtoUpperCase = s -> System.out.println(s.toUpperCase());
	   
	    convertStringtoUpperCase.accept("venkatesh");
	    convertStringtoUpperCase.accept("suraj");
	    	    
	}
}	
