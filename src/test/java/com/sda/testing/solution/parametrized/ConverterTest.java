package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import com.sda.advanced.solution.zad17.ConversionType;
import com.sda.advanced.solution.zad17.ConversionTypeWithFunction;
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
			names = { "METERS_TO_YARDS", "INCHES_TO_CENTIMETERS", "MILES_TO_KILOMETERS" })
	void someOperationsShouldConvertToHigherValue(ConversionType conversionType) {
		int i = new Random().nextInt(1000);
		assertTrue(converter.convert(i, conversionType) > i);
	}

	@ParameterizedTest
	@MethodSource("conversionTypePairs")
	void someOperationsShouldBeReversible(ConversionTypeWithFunction conversionType1,
			ConversionTypeWithFunction conversionType2) {

		double initialValue = 10.0;
		double convert = converter.convert(initialValue, conversionType1);
		double finalValue = converter.convert(convert, conversionType2);

		assertEquals(initialValue, finalValue);
	}

	private static Stream<Arguments> conversionTypePairs() {
		return Stream.of(
				Arguments.of(
						ConversionTypeWithFunction.YARDS_TO_METERS,
						ConversionTypeWithFunction.METERS_TO_YARDS
				),
				Arguments.of(
						ConversionTypeWithFunction.METERS_TO_YARDS,
						ConversionTypeWithFunction.YARDS_TO_METERS
				),
				Arguments.of(
						ConversionTypeWithFunction.INCHES_TO_CENTIMETERS,
						ConversionTypeWithFunction.CENTIMETERS_TO_INCHES
				),
				Arguments.of(
						ConversionTypeWithFunction.CENTIMETERS_TO_INCHES,
						ConversionTypeWithFunction.INCHES_TO_CENTIMETERS
				),
				Arguments.of(
						ConversionTypeWithFunction.KILOMETERS_TO_MILES,
						ConversionTypeWithFunction.MILES_TO_KILOMETERS
				),
				Arguments.of(
						ConversionTypeWithFunction.MILES_TO_KILOMETERS,
						ConversionTypeWithFunction.KILOMETERS_TO_MILES
				)
		);
	}

	@ParameterizedTest
	@MethodSource("conversionTypePairsFancy")
	void someOperationsShouldBeReversiblePlayground(
			ConversionTypeWithFunction conversionType1,
			ConversionTypeWithFunction conversionType2,
			double initialValue) {

		double convert = converter.convert(initialValue, conversionType1);
		double finalValue = converter.convert(convert, conversionType2);

		assertEquals(initialValue, finalValue);
	}

	public static Stream<Arguments> conversionTypePairsFancy() {
		return Stream.of(
				Arguments.of(
						ConversionTypeWithFunction.YARDS_TO_METERS,
						ConversionTypeWithFunction.METERS_TO_YARDS,
						10.0
				),
				Arguments.of(
						ConversionTypeWithFunction.YARDS_TO_METERS,
						ConversionTypeWithFunction.METERS_TO_YARDS,
						-11.2
				),
				Arguments.of(
						ConversionTypeWithFunction.YARDS_TO_METERS,
						ConversionTypeWithFunction.METERS_TO_YARDS,
						new Random().nextInt()
				)
		);
	}
}
