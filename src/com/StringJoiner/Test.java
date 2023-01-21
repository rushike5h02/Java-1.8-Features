package com.StringJoiner;

import java.util.StringJoiner;

public class Test {

	public static void main(String[] args) {
		
		StringJoiner stringJoiner = new StringJoiner(" & "); // passing comma(,) as delimiter

		// Adding values to StringJoiner 
		stringJoiner.add("rushi"); 
		stringJoiner.add("swapnil"); 
		stringJoiner.add("avaish"); 
		stringJoiner.add("deepak"); 
		System.out.println(stringJoiner);


	}

}
