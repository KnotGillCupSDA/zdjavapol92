package com.sda.advanced.solution.zad27;

public class Joiner<T> {

	public String join(String delimiter, T... parts) {
		StringBuilder builder = new StringBuilder();
		for (T part : parts) {
			builder.append(part.toString());
			builder.append(delimiter);
		}
		builder.deleteCharAt(builder.length()-1);
		return builder.toString();
	}

}
