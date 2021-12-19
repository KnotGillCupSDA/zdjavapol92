package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisibilityCheckerTest {

	@Test
	void shouldBeDivisibleBy3() {
		//given
		int i = 9;

		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertTrue(actual);
	}
}