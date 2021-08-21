package com.sda.advanced.solution.zad11;

public class CircleWith2Points implements Circle {

	private final Point2D center;
	private final Point2D point;

	public CircleWith2Points(Point2D center, Point2D point) {
		this.center = center;
		this.point = point;
	}

	public double getRadius() {
		return Math.sqrt(
				Math.pow(center.getX() - point.getX(), 2)
						+ Math.pow(center.getY() - point.getY(), 2));
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
		point.move(moveDirection);
	}

	@Override
	public void resize(double resizeFactor) {
		//resize by radius size
		double newX = ((center.getX() - point.getX()) * resizeFactor) + center.getX();
		point.setX(newX);

		double newY = ((center.getY() - point.getY()) * resizeFactor) + center.getY();
		point.setY(newY);
	}
}
