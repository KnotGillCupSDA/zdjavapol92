package com.sda.testing.solution.parametrized.romannumeral;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

class RomanNumeralConverterTest {

	@ParameterizedTest
	@EnumSource
	void shouldConvertSimpleValuesToRomanNotation(RomanNumeralConverter.ArabicToRoman arabicToRoman) {
		assertEquals(arabicToRoman.getRoman(),
				RomanNumeralConverter.romanFor(arabicToRoman.getArabic()));
	}

	@ParameterizedTest
	@CsvSource({"234, CCXXXIV", "4999, MMMMCMXCIX", "767, DCCLXVII"})
	void shouldConvertComplexValuesToRomanNotation(int arabic, String expectedRoman) {
		assertEquals(expectedRoman, RomanNumeralConverter.romanFor(arabic));
	}
}