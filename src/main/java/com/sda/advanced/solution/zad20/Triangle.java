package com.sda.advanced.solution.zad20;

public class Triangle extends Shape {

	private final int a;
	private final int b;
	private final int c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public int calculatePerimeter() {
		return a + b + c;
	}
}
