package com.sda.advanced.solution.zad17;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ConverterTest {

	private Converter converter;

	@BeforeEach
	void setUp() {
		converter = new Converter();
	}

	@ParameterizedTest
	@MethodSource("conversions")
	void shouldConvert(double in, ConversionType conversionType, double expected) {
		final double convert = converter.convert(in, conversionType);
		assertThat(convert)
				.isCloseTo(expected, Percentage.withPercentage(1.0));
		assertEquals(expected, convert);
	}

	public static Stream<Arguments> conversions() {
		return Stream.of(
				Arguments.of(
						1, ConversionType.METERS_TO_YARDS, 1.09361
				),
				Arguments.of(
						1, ConversionType.METERS_TO_YARDS, 1.09362
				)
		);
	}

	@Test
	void shouldConvert() {
		final double convert = converter.convert(1, ConversionTypeWithFunction.METERS_TO_YARDS);
		assertThat(convert)
				.isCloseTo(1.09361, Percentage.withPercentage(1.0));
	}
}