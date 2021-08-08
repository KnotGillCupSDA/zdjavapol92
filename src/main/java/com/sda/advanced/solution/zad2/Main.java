package com.sda.advanced.solution.zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> unsorted = List.of("A", "B", "b", "Z", "a", "c");
		List<String> sorted = sortCaseInsensitive(unsorted);

		System.out.println("unsorted: "+ unsorted);
		System.out.println("sorted: "+ sorted);

	}

	private static List<String> sortCaseInsensitive(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		sorted.sort((o1, o2) -> -o1.toLowerCase().compareTo(o2.toLowerCase()));
		return sorted;
	}

}
