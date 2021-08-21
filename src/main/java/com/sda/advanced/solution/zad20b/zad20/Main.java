package com.sda.advanced.solution.zad20b.zad20;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		final Shape triangle = new Triangle(1, 2, 3);
		System.out.println(triangle.calculatePerimeter());

		final Shape rectangle = new Rectangle(2, 3);
		System.out.println(rectangle.calculatePerimeter());

		final Hexagon hexagon = new Hexagon(1);
		System.out.println(hexagon.calculatePerimeter());

		Collection<Shape> shapes = List.of(triangle, rectangle, hexagon);
		for (Shape shape : shapes) {
			System.out.println(shape.calculatePerimeter());
		}

		System.out.println(Stream.of(triangle, triangle, rectangle, hexagon, hexagon)
				.map(Shape::calculatePerimeter)
				.mapToInt(Integer::intValue)
				.sum());
	}

}
