package com.sda.advanced.solution.zad20b.zad20;

public class Hexagon extends Shape {

	private final int a;

	public Hexagon(int a) {
		super(a, a, a, a, a, a);
		this.a = a;
	}

	@Override
	public int calculatePerimeter() {
		return 6 * a;
	}
}
