package com.sda.advanced.solution.zad13;

import java.util.ArrayList;
import java.util.List;

import com.sda.advanced.solution.zad12.Car;

public class CarService {

	private final List<Car> cars;

	public CarService() {
		cars = new ArrayList<>();
	}

	public void add(Car car) {
		cars.add(car);
	}

}
