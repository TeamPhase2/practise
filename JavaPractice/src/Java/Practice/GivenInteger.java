package Java.Practice;

import java.util.function.Predicate;

public class GivenInteger {

	public static void main(String[] args) {
		
		// Creating Predicate
		Predicate<Integer> Lessthan = i -> (i < 10); 

	      // Calling Predicate method
	      System.out.println(Lessthan.test(15));
	      System.out.println(Lessthan.test(8));
	      System.out.println(Lessthan.test(11));
	  }

}	
	


