package com.sda.advanced.solution.zad8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidatorImplTest {

	@Test
	void shouldReturnFalseWhenSumOfLengthsAbove300() {
		//given
		final ValidatorImpl validator = new ValidatorImpl();

		//when
		final boolean isValid = validator.validate(new Parcel());

		//then
		assertFalse(isValid);
	}
}