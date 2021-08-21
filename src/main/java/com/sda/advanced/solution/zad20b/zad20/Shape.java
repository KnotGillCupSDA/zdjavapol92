package com.sda.advanced.solution.zad20b.zad20;

import java.util.Arrays;

public class Shape {

	protected final int[] a;

	public Shape(int... a) {
		this.a = a;
	}

	public int calculatePerimeter() {
		return Arrays.stream(a).sum();
	}

}
