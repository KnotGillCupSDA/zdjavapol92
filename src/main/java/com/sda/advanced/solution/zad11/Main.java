package com.sda.advanced.solution.zad11;

public class Main {

	public static void main(String[] args) {
		Circle circle = new CircleWithRadius(new Point2D(0.0, 0.0), new Point2D(1.0, 0.0));
		System.out.println("radius: " + circle.getRadius());
		System.out.println("perimeter: " + circle.getPerimeter());
		System.out.println("area: " + circle.getArea());

		System.out.println("======");
		circle.move(new MoveDirection(5, 0));

		System.out.println("radius: " + circle.getRadius());
		System.out.println("perimeter: " + circle.getPerimeter());
		System.out.println("area: " + circle.getArea());
	}
}
