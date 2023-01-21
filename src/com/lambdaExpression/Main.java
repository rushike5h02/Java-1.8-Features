package com.lambdaExpression;

public class Main {

	public static void main(String[] args) {
		
		// Multiple parameters in lambda expression 
		
		Addition addition = (a, b) -> (a + b);
		System.out.println(addition.add(10, 20));

		// Multiple parameters with data type in lambda expression 
		
		Addition addition2 = (int a, int b) -> (a + b); 
		System.out.println(addition2.add(100, 200));


	}

}
