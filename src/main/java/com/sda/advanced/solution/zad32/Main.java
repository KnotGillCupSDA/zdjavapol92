package com.sda.advanced.solution.zad32;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		final List<Car> cars = List.of(new Car("Subaru", 200_000.0),
				new Car("BMW", 233_000.0));

		final Path file = Path.of("src", "main", "resources", "zad32", "cars.db");

		save(file, cars);

		List<Car> readCars = load(file);

		System.out.println(readCars);
	}

	private static List<Car> load(Path file) {
		return Collections.emptyList();
	}

	private static void save(Path file, List<Car> cars) {

	}

}
