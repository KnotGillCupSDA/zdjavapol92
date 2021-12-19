package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.sda.advanced.solution.zad17.ConversionType;
import com.sda.advanced.solution.zad17.Converter;

public class ConverterTest {

	private static Converter converter;

	@BeforeAll
	static void beforeAll() {
		converter = new Converter();
	}

	@ParameterizedTest
	@EnumSource
	void shouldAlwaysConvertToDoubleWithinBoundaries(ConversionType conversionType) {
		double convert = converter.convert(1032342, conversionType);

		assertTrue(convert < Double.MAX_VALUE);
		assertTrue(convert > Double.MIN_VALUE);
		assertNotEquals(Double.NaN, convert);
	}

	@ParameterizedTest
	@EnumSource(value = ConversionType.class,
			names = {"METERS_TO_YARDS", "INCHES_TO_CENTIMETERS", "MILES_TO_KILOMETERS"})
	void someOperationsShouldConvertToHigherValue(ConversionType conversionType) {
		int i = new Random().nextInt(1000);
		assertTrue(converter.convert(i, conversionType) > i);
	}
}
