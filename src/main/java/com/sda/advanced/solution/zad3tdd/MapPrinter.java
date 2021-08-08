package com.sda.advanced.solution.zad3tdd;

import java.util.Map;

public class MapPrinter {

	public String print(Map<String, Integer> map) {
		StringBuilder builder = new StringBuilder();
		int i = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (++i == map.size()) {
				builder.append("Klucz: ").append(entry.getKey()).append(", Wartość: ").append(entry.getValue()).append(".");
			} else {
				builder.append("Klucz: ").append(entry.getKey()).append(", Wartość: ").append(entry.getValue()).append(",");
			}
		}
		return builder.toString();
	}
}
