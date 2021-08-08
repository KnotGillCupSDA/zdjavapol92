package com.sda.advanced.solution.zad2;

import java.util.Comparator;

public class MyReversedCaseInsensitiveComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		final String o11 = o1.toLowerCase();
		final String o22 = o2.toLowerCase();
		System.out.println("o1: "+ o1 + " o2: "+ o2);
		System.out.println("o11: "+ o11 + " o22: "+ o22);
		return -o11.compareTo(o22);
	}
}
