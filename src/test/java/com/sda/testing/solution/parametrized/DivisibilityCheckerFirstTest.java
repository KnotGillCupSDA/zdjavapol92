package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The first test class - without parametrization
 * We can clearly see that the class is getting bigger and bigger after each test case
 * Can be solved by parametrization
 */
class DivisibilityCheckerFirstTest {

	@Test
	void shouldBeDivisibleBy3() {
		//given
		int i = 9;

		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertTrue(actual);
	}

	@Test
	void shouldNotBeDivisibleBy3() {
		//given
		int i = 8;

		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertFalse(actual);
	}

	@Test
	void shouldBeDivisibleBy3NegativeNumber() {
		//given
		int i = -6;

		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertTrue(actual);
	}

	@Test
	void shouldNotBeDivisibleBy3NegativeNumber() {
		//given
		int i = -5;

		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertFalse(actual);
	}

	@Test
	void zeroShouldBeDivisibleBy3() {
		//given
		int i = 0;

		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertTrue(actual);
	}
}