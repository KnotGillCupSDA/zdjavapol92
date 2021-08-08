package com.sda.advanced.solution.zad3oo;

import java.util.Map;
import java.util.stream.Collectors;

public class MapPrinter {

	private final Map<String, Integer> map;

	public MapPrinter(Map<String, Integer> map) {
		this.map = map;
	}

	void print() {
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
	void printWithStream() {
		final String collect = map.entrySet().stream()
				.map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
				.collect(Collectors.joining("," + System.lineSeparator(), "", "."));

		System.out.println(collect);
	}

}
