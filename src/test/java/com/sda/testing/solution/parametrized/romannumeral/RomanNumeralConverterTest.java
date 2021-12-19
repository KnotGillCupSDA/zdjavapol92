package com.sda.testing.solution.parametrized.romannumeral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

class RomanNumeralConverterTest {

	@ParameterizedTest
	@EnumSource
	void shouldConvertSimpleValuesToRomanNotation(RomanNumeralConverter.ArabicToRoman arabicToRoman) {

	}

	@ParameterizedTest
	@CsvSource({"234, CCXXXIV", "4999, MMMMCMXCIX"})
	void shouldConvertComplexValuesToRomanNotation(int arabic, String expectedRoman) {

	}
}