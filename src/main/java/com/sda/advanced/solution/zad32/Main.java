package com.sda.advanced.solution.zad32;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		final List<Car> cars = List.of(new Car("Subaru", 200_000.0, true),
				new Car("BMW", 233_000.0, false));

		final AbstractCarStorage carStorage = new SerializableCarStorage(Path.of("src", "main", "resources", "zad32"));

		carStorage.save(cars);
		List<Car> readCars = carStorage.load();

		System.out.println(readCars);
	}

}
