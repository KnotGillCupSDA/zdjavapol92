package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> unsorted = List.of("A", "B", "b", "Z", "a", "c");
		List<String> sorted = sortOnList(unsorted);

		System.out.println("unsorted: "+ unsorted);
		System.out.println("sorted: "+ sorted);

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

	private static List<String> sortLambda(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);

		//3 - with lambda, since java 8
		Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));
		return sorted;
	}

	private static List<String> sortStream(List<String> unsorted) {
		//4 - with streams, since java 8
		return unsorted.stream()
				//.sorted(new MyReversedComparator())
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}

	private static List<String> sortOnList(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);

		//5 - directly on List, since java 11
		//sorted.sort(new MyReversedComparator());
		//sorted.sort((o1, o2) -> -o1.compareTo(o2));

		//with built-in reversed order comparator
		sorted.sort(Comparator.reverseOrder());
		return sorted;
	}

}
