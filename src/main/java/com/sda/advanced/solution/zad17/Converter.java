package com.sda.advanced.solution.zad17;

public class Converter {

	/**
	 * @throws java.lang.IllegalArgumentException when negative number is passed
	 */
	public double convert(double value, ConversionType conversionType) {
		if(value < 0) {
			throw new IllegalArgumentException("Negative numbers are forbidden");
		}
		return value * conversionType.getFactor();
	}

	public double convert(double value, ConversionTypeWithFunction conversionType) {
		return conversionType.getConversionFunction().apply(value);
	}
}
