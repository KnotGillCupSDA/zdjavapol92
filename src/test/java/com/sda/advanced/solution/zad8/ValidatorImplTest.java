package com.sda.advanced.solution.zad8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidatorImplTest {

	private Validator validator;

	@BeforeEach
	void setUp() {
		validator = new ValidatorImpl();
	}

	@Test
	void shouldReturnFalseWhenSumOfLengthsAbove300() {
		//when
		final boolean isValid = validator.validate(new Parcel());

		//then
		assertFalse(isValid);
	}
}