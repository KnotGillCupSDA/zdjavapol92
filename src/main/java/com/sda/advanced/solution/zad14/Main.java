package com.sda.advanced.solution.zad14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	private static final int BOUND = 100_000;

	public static void main(String[] args) {
		int[] array = new int[100_000];

		fill(array);
		//System.out.println(Arrays.toString(array));

		System.out.println("========");
		List<Integer> distinct = getDistinct(array);
		System.out.println(distinct.size());
		System.out.println("========");

		List<Integer> duplicates = getDuplicates(array);
		System.out.println(duplicates.size());
		System.out.println("========");

		System.out.println(distinct.size() + duplicates.size());
		System.out.println("========");

		List<Integer> top = getTop25(array);
		System.out.println(top);
	}

	private static void fill(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUND);
		}
	}

	private static List<Integer> getDistinct(int[] array) {
		Set<Integer> distinct = new HashSet<>();
		for (int i : array) {
			distinct.add(i);
		}
		return new ArrayList<>(distinct);
	}

	private static List<Integer> getDistinctWithStream(int[] array) {
		return Arrays.stream(array)
				.distinct()
				.boxed() //we need to box primitive int to Integer object
				.collect(Collectors.toList());
	}

	private static List<Integer> getDuplicates(int[] array) {
		Set<Integer> helper = new HashSet<>();
		List<Integer> duplicates = new ArrayList<>();
		for (int i : array) {
			if (!helper.contains(i)) {
				helper.add(i);
			} else {
				duplicates.add(i);
			}
		}
		return duplicates;
	}

	private static List<Integer> getTop25(int[] array) {
		Map<Integer, Integer> counterMap = new HashMap<>();
		for (int i : array) {
			if (!counterMap.containsKey(i)) {
				counterMap.put(i, 1);
			} else {
				Integer integer = counterMap.get(i);
				Integer newInteger = integer + 1;
				counterMap.put(i, newInteger);
			}
			/*counterMap.compute(i,
					(k, v) -> {
						if (v == null) {
							return 1;
						} else {
							return v + 1;
						}
					});*/
		}

		//System.out.println(counterMap);

		return counterMap.entrySet()
				.stream()
				//.sorted((o1, o2) -> -o1.getValue().compareTo(o2.getValue()))
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.limit(25)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

	}

}
