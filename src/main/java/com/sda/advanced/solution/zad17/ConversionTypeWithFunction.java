package com.sda.advanced.solution.zad17;

import java.util.function.Function;

public enum ConversionTypeWithFunction {
	METERS_TO_YARDS(v -> v * 1.09361),
	YARDS_TO_METERS(v -> v * 0.9144),
	CENTIMETERS_TO_ICHES(v -> v * 0.393701),
	INCHES_TO_CENTIMETERS(v -> v * 2.54),
	KILOMETERS_TO_MILES(v -> v * 0.621371),
	MILES_TO_KILOMETERS(v -> v * 1.60934);

	private final Function<Double, Double> conversionFunction;

	ConversionTypeWithFunction(Function<Double, Double> conversionFunction) {
		this.conversionFunction = conversionFunction;
	}

	public Function<Double, Double> getConversionFunction() {
		return conversionFunction;
	}
}
