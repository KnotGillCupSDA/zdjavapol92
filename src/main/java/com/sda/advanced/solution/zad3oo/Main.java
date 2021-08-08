package com.sda.advanced.solution.zad3oo;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("Java", 18,
				"C#", 9,
				"Python", 1,
				"JavaScript", 0,
				"PHP", 0);

		final MapPrinter mapPrinter = new MapPrinter(map);
		mapPrinter.print();
	}

}
