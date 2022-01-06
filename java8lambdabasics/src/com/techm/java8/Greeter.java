package com.techm.java8;

public class Greeter {
	
/*	public void greet() {
		System.out.print("Hello world!");
	} 
*/
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
	    Greeter greeter = new Greeter();
	  
	  //HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
	    
	  //Greeting helloWorldGreeting = new HelloWorldGreeting();
	  //Greeting lambdaGreeting = () -> System.out.print("Hello World!"); lambda expression
	    
	    Greeting innerClassGreeting = new Greeting(){
	    	public void perform() {
	    	    System.out.print("Hello world!");
	        }
	    };
	    
	    greeter.greet(() -> System.out.print("Hello World!")); 
	    greeter.greet(innerClassGreeting);
		
	  //helloWorldGreeting.perform();
	  //lambdaGreeting.perform();
	    
	  //myLambdaFunction = () -> System.out.print("Hello World");
	  //MyAdd addFunction = (int a, int b) -> a+b; 
		
	}

}


/*
 
interface MyLambda {
	void foo();
}

interface MyAdd {
	int add(int a, int b);
}

*/
	
