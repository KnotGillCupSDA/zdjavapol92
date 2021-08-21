package com.sda.advanced.solution.zad11;

public class CircleWithRadius implements Circle {

	private final Point2D center;
	private double radius;

	public CircleWithRadius(Point2D center, Point2D point) {
		this.center = center;
		this.radius = calculateRadius(center, point);
	}

	private double calculateRadius(Point2D center, Point2D point) {
		return Math.sqrt(
				Math.pow(center.getX() - point.getX(), 2)
						+ Math.pow(center.getY() - point.getY(), 2));
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}

	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	public void move(MoveDirection moveDirection) {
		center.move(moveDirection);
	}

	@Override
	public void resize(double resizeFactor) {
		radius *= resizeFactor;
	}
}
