package com.sda.advanced.solution.zad1;

import java.util.Comparator;

public class MyReversedComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		System.out.println("o1: "+ o1 + " o2: "+ o2);
		return -o1.compareTo(o2);
	}
}
