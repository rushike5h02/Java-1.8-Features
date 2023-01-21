package com.ForEachMethod;

import java.util.HashMap; 
import java.util.Map.*;

public class Map {

	public static void main(String[] args) {
		
		HashMap <String, String> map = new HashMap<String, String>(); 
		map.put("10", "rushikesh");
		map.put("11", "swapnil");
		map.put("12", "avaish");

		map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));


	}

}
