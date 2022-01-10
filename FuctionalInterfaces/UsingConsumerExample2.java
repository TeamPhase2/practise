package Java.FuctionalInterfaces;

import java.util.function.Consumer;

public class UsingConsumerExample2 {
	
	public static void main(String[] args) {
		
        
	    Consumer<String> c = s -> System.out.println(s.toUpperCase());
	   
	    c.accept("venkatesh");
	    c.accept("suraj");
	    	    
	}
}	
