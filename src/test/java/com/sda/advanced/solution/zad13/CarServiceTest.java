package com.sda.advanced.solution.zad13;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sda.advanced.solution.zad12.Car;
import com.sda.advanced.solution.zad12.Manufacturer;

class CarServiceTest {

	private CarService carService;
	private Manufacturer fiat;
	private Manufacturer mercedes;
	private Manufacturer porsche;
	private Manufacturer tesla;
	private Manufacturer benz;
	private Car panda;
	private Car sclass;
	private Car sclass2;
	private Car cayenne;
	private Car boxter;
	private Car eclass;

	@BeforeEach
	void setUp() {
		carService = new CarService();

		fiat = new Manufacturer("Fiat", "Italy", 1900);
		mercedes = new Manufacturer("Manufacturer", "Germany", 1901);
		porsche = new Manufacturer("Porsche", "Germany", 1950);
		tesla = new Manufacturer("Tesla", "USA", 2010);
		benz = new Manufacturer("Benz", "Germany", 1901);

		panda = new Car("Panda", "Fiat", 40000, 2011, Collections.singletonList(fiat), Car.EngineType.S4);
		sclass = new Car("S600", "Mercedes", 500000, 2020, List.of(mercedes, benz), Car.EngineType.V12);
		sclass2 = new Car("S600", "Mercedes", 550000, 2021, List.of(mercedes, benz), Car.EngineType.V12);
		cayenne = new Car("Cayenne", "Porsche", 300000, 2009, Collections.singletonList(porsche), Car.EngineType.V8);
		boxter = new Car("Boxter", "Porsche", 250000, 2001, Collections.singletonList(porsche), Car.EngineType.S6);
		eclass = new Car("E500", "Mercedes", 400000, 1992, Collections.singletonList(mercedes), Car.EngineType.V8);

		carService.addCar(panda);
		carService.addCar(eclass);
		carService.addCar(sclass);
		carService.addCar(sclass2);
		carService.addCar(cayenne);
		carService.addCar(boxter);
	}

	@Test
	void shouldReturnCarsWithV12Engine() {
		final List<Car> carsWithV12Engine = carService.getCarsWithV12Engine();
		assertThat(carsWithV12Engine)
				.containsExactlyInAnyOrder(sclass, sclass2);
	}
}