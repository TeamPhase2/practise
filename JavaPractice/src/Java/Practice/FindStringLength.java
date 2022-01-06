package Java.Practice;

import java.util.function.Predicate;

public class FindStringLength {
	
	public static void main(String[] args) {
	
	  Predicate<String> p = s->(s.length()==4);
    
	  System.out.println(p.test("Venky"));
	  System.out.println(p.test("Find"));
	
	}

}


