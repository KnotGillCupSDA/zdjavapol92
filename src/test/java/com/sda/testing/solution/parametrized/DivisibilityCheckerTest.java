package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DivisibilityCheckerTest {

	@ParameterizedTest
	@ValueSource(ints = {9, 6, -6, 0})
	void shouldBeDivisibleBy3(int i) {
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertTrue(actual);
	}

	@ParameterizedTest
	@ValueSource(ints = {-5, 1, 2, 7, Integer.MAX_VALUE})
	void shouldBeNotDivisibleBy3(int i) {
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertFalse(actual);
	}
}
