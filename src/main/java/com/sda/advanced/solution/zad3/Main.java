package com.sda.advanced.solution.zad3;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//old school - mutable map
        /*Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("C#", 9);
        map.put("Python", 1);
        map.put("JavaScript", 0);
        map.put("PHP", 0);*/

		//java 11 style - immutable map
		Map<String, Integer> map = Map.of("Java", 18,
				"C#", 9,
				"Python", 1,
				"JavaScript", 0,
				"PHP", 0);

		print(map);
	}

	private static void print(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
