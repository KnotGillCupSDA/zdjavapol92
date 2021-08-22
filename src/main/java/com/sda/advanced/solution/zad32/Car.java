package com.sda.advanced.solution.zad32;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 3093256715824564226L;

	private final String model;
	private final double price;
	private final boolean isNew;

	public Car(String model, double price, boolean isNew) {
		this.model = model;
		this.price = price;
		this.isNew = isNew;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public boolean isNew() {
		return isNew;
	}

	@Override
	public String toString() {
		return "Car{" +
				"model='" + model + '\'' +
				", price=" + price +
				", isNew=" + isNew +
				'}';
	}
}
