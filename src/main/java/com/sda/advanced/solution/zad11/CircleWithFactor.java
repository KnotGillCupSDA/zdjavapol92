package com.sda.advanced.solution.zad11;

public class CircleWithFactor implements Circle {

	private final Point2D center;
	private final Point2D point;
	private double resizeFactor;

	public CircleWithFactor(Point2D center, Point2D point) {
		this.center = center;
		this.point = point;
		resizeFactor = 1.0;
	}

	public double calculateRadius(Point2D center, Point2D point) {
		return resizeFactor * Math.sqrt(
				Math.pow(center.getX() - point.getX(), 2)
						+ Math.pow(center.getY() - point.getY(), 2));
	}

	public double getRadius() {
		return calculateRadius(center, point);
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
		this.resizeFactor = resizeFactor;
	}
}
