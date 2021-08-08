package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> unsorted = List.of("A", "B", "b", "Z", "a", "c");
		List<String> sorted = sortNamed(unsorted);
		System.out.println(sorted);

	}

	private static List<String> sortAnonymous(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);

		//1 - inline/anonymous Comparator interface implementation
		Collections.sort(sorted, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		return sorted;
	}

	private static List<String> sortNamed(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);

		//2 - named Comparator interface implementation
		Collections.sort(sorted, new MyReversedComparator());
		return sorted;
	}

}
