package com.sda.testing.solution.exteption;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.sda.advanced.solution.zad17.ConversionType;
import com.sda.advanced.solution.zad17.Converter;

public class ConverterTest {

	@Test
	void shouldThrowExceptionForNegativeNumbers() {
		assertThrows(IllegalArgumentException.class, () -> new Converter().convert(-4.0, ConversionType.METERS_TO_YARDS));
	}
}
