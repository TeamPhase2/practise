package com.techm.java8;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
/*      StringLengthLambda mylambda = (String s) -> s.length();
		StringLengthLambda mylambda = s -> s.length();
	    System.out.print(mylambda.getLength("Hello Lambda!"));
*/	    
		printLambda( s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda!"));
	}
     
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
	
	
	
}
