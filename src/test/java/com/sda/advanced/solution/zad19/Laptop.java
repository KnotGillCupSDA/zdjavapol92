package com.sda.advanced.solution.zad19;

import java.util.Objects;

public class Laptop extends Computer {

	public Laptop(String processor, int memory, String gpu, String manufacturer, String model,
			int battery) {
		super(processor, memory, gpu, manufacturer, model);
		this.battery = battery;
	}

	private int battery;

	public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

	@Override
	public void someMethod() {
		System.out.println("Laptop someMethod");
		super.someMethod();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		Laptop laptop = (Laptop) o;
		return battery == laptop.battery;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), battery);
	}

	@Override
	public String toString() {
		return "Laptop{" +
				"battery=" + battery +
				"} " + super.toString();
	}
}
