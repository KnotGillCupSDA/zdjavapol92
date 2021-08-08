package com.sda.advanced.solution.zad3tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapPrinterTest {

	private static final Map<String, Integer> MAP = Map.of("Java", 18,
			"C#", 9,
			"Python", 1,
			"JavaScript", 0,
			"PHP", 0);
	private MapPrinter mapPrinter;

	@BeforeEach
	void setUp() {
		mapPrinter = new MapPrinter();
	}

	@Test
	void shouldHaveDotAtTheEnd() {
		String prettyPrint = mapPrinter.print(MAP);
		assertTrue(prettyPrint.endsWith("."), "pretty:" + prettyPrint);
	}
}