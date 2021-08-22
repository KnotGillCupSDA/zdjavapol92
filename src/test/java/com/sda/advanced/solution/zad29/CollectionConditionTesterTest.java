package com.sda.advanced.solution.zad29;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sda.advanced.solution.zad12.Car;
import com.sda.advanced.solution.zad12.Manufacturer;

class CollectionConditionTesterTest {

	private Manufacturer fiat;
	private Manufacturer mercedes;
	private Manufacturer porsche;
	private Manufacturer benz;
	private Car panda;
	private Car sclass;
	private Car sclass2;
	private Car cayenne;

	@BeforeEach
	void setUp() {

		fiat = new Manufacturer("Fiat", "Italy", 1900);
		mercedes = new Manufacturer("Manufacturer", "Germany", 1901);
		porsche = new Manufacturer("Porsche", "Germany", 1950);
		benz = new Manufacturer("Benz", "Germany", 1901);

		panda = new Car("Panda", "Fiat", 40000, 2011, Collections.singletonList(fiat), Car.EngineType.S4);
		sclass = new Car("S600", "Mercedes", 500000, 2020, List.of(mercedes, benz), Car.EngineType.V12);
		sclass2 = new Car("S600", "Mercedes", 550000, 2021, List.of(mercedes, benz), Car.EngineType.V12);
		cayenne = new Car("Cayenne", "Porsche", 300000, 2009, Collections.singletonList(porsche), Car.EngineType.V8);
	}

	@Test
	void shouldCalculatePercentage() {
		final List<Car> cars = List.of(panda, sclass, sclass2, cayenne);

		assertEquals(50.0,
				CollectionConditionTester.partOf(cars,
						c -> c.getManufacturers().size() > 1));

		final List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(25.0,
				CollectionConditionTester.partOf(integers, i -> i >= 7));
	}
}