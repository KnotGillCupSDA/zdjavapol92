package com.sda.advanced.solution.zad14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	private static final int BOUND = 1000;

	public static void main(String[] args) {
		int[] array = new int[100_000];

		fill(array);

		List<Integer> distinct = getDistinct(array);

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

	private static void fill(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUND);
		}
	}

}
