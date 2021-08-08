package com.sda.advanced.solution.zad3;

import java.util.Map;
import java.util.stream.Collectors;

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
		System.out.println("=========");
		printWithStream(map);
	}

	private static void print(Map<String, Integer> map) {
		int i = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			i = i + 1;
			if (i == map.size()) {
				System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
			} else {
				System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
			}
		}
	}

	private static void printWithStream(Map<String, Integer> map) {
		final String collect = map.entrySet().stream()
				.map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
				.collect(Collectors.joining("," + System.lineSeparator(), "", "."));

		System.out.println(collect);
	}
}
