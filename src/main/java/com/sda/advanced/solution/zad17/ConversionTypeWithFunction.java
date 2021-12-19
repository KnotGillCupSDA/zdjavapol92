package com.sda.advanced.solution.zad17;

import java.util.function.Function;

public enum ConversionTypeWithFunction {
	METERS_TO_YARDS(v -> 1.0936 * v),
	YARDS_TO_METERS(v -> v / 1.0936),
	CENTIMETERS_TO_INCHES(v -> v * 0.39370),
	INCHES_TO_CENTIMETERS(v -> v / 0.39370),
	KILOMETERS_TO_MILES(v -> v * 0.62137),
	MILES_TO_KILOMETERS(v -> v / 0.62137);

	private final Function<Double, Double> conversionFunction;

	ConversionTypeWithFunction(Function<Double, Double> conversionFunction) {
		this.conversionFunction = conversionFunction;
	}

	public Function<Double, Double> getConversionFunction() {
		return conversionFunction;
	}
}
