package com.functionalinterface;

public class Main implements Test {
	@Override
	public void getStudentName(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Main main = new Main(); 
		main.getStudentName("rushikesh");
	}


	}

	


