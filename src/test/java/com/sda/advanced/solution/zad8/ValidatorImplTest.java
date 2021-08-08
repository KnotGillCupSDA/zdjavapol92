package com.sda.advanced.solution.zad8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidatorImplTest {

	private Validator validator;

	@BeforeEach
	void setUp() {
		validator = new ValidatorImpl();
	}

	@Test
	void testStandardParcelHappyPath() {
		Parcel parcel = new Parcel(31, 32, 33, 19.0f, false);
		assertTrue(validator.validate(parcel));
	}

	@Test
	void testExpressParcelHappyPath() {
		Parcel parcel = new Parcel(31, 32, 33, 13.0f, true);
		assertTrue(validator.validate(parcel));
	}

	@Test
	void thatIsNotValidWhenSumOfLengthsIsTooHigh() {
		Parcel parcel = new Parcel(240, 31, 32, 1, false);
		assertFalse(validator.validate(parcel));
	}

	@Test
	void thatIsNotValidWhenAnyDimensionIsTooLow() {
		List<Parcel> parcels = Arrays.asList(
				new Parcel(1, 31, 31, 1, false),
				new Parcel(31, 1, 31, 1, false),
				new Parcel(31, 31, 1, 1, false));

		for (Parcel parcel : parcels) {
			assertFalse(validator.validate(parcel));
		}
	}

	@Test
	void thatIsNotValidWhenTooHeavyStandard() {
		Parcel parcel = new Parcel(10, 10, 10, 34, false);
		assertFalse(validator.validate(parcel));
	}

	@Test
	void thatIsNotValidWhenTooHeavyExpress() {
		Parcel parcel = new Parcel(10, 10, 10, 17, true);
		assertFalse(validator.validate(parcel));
	}
}