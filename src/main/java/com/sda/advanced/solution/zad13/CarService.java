package com.sda.advanced.solution.zad13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sda.advanced.solution.zad12.Car;
import com.sda.advanced.solution.zad12.Manufacturer;

public class CarService {

	public enum Operation {
		LESS_THAN
	}

	private final List<Car> cars;

	public CarService() {
		cars = new ArrayList<>();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public void remove(Car car) {
		cars.remove(car);
	}

	public List<Car> getAll() {
		return List.copyOf(cars);
	}

	public List<Car> getCarsWithV12Engine() {
		List<Car> result = new ArrayList<>();
		for (Car car : cars) {
			if (car.getEngineType() == Car.EngineType.V12) {
				result.add(car);
			}
		}
		return result;
	}

	public List<Car> getCarsWithV12EngineOnStream() {
		return cars.stream()
				.filter(car -> car.getEngineType() == Car.EngineType.V12)
				.collect(Collectors.toList());
	}

	public List<Car> getCarsProducedBefore1999() {
		return cars.stream()
				.filter(car -> car.getProductionYear() < 1999)
				.collect(Collectors.toList());
	}

	public Optional<Car> getMostExpensiveCar() {
		Car max = null;
		for (Car car : cars) {
			if (max == null || car.getPrice() > max.getPrice()) {
				max = car;
			}
		}
		return Optional.ofNullable(max);
	}

	public Optional<Car> getMostExpensiveCarOnStream() {
		return cars.stream().max(Comparator.comparingDouble(Car::getPrice));
	}

	public Optional<Car> getCheapestCar() {
		return cars.stream()
				.min(Comparator.comparingDouble(Car::getPrice));
	}

	public List<Car> getCarsHavingAtLeast3Manufacturers() {
		List<Car> result = new ArrayList<>();
		for (Car car : cars) {
			if (car.getManufacturers().size() >= 3) {
				result.add(car);
			}
		}
		return result;
	}

	public List<Car> getCarsHavingAtLeast3ManufacturersOnStream() {
		return cars.stream()
				.filter(car -> car.getManufacturers().size() >= 3)
				.collect(Collectors.toList());
	}

	public List<Car> getCarsSortedByName(boolean ascending) {
		if (ascending) {
			return cars.stream()
					.sorted(Comparator.comparing(Car::getName))
					.collect(Collectors.toList());
		} else {
			return cars.stream()
					.sorted(Comparator.comparing(Car::getName).reversed())
					.collect(Collectors.toList());
		}
	}

	public boolean contains(Car car) {
		return cars.contains(car);
	}

	public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
		List<Car> result = new ArrayList<>();
		for (Car car : cars) {
			if (car.getManufacturers().contains(manufacturer)) {
				result.add(car);
			}
		}
		return result;
	}

	public List<Car> getCarsProducedByOnStream(Manufacturer manufacturer) {
		return cars.stream()
				.filter(car -> car.getManufacturers().contains(manufacturer))
				.collect(Collectors.toList());
	}

	public List<Car> getCarsProducedBy(int foundedYear, Operation operation) {
		if (operation == Operation.LESS_THAN) {
			return cars.stream()
					.filter(car -> car.getManufacturers().stream()
							.anyMatch(m -> m.getFoundedInYear() < foundedYear))
					.collect(Collectors.toList());
		}

		return Collections.emptyList();
	}
}
