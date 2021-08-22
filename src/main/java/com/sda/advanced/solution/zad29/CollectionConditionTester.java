package com.sda.advanced.solution.zad29;

import java.util.Collection;
import java.util.function.Predicate;

public class CollectionConditionTester {

	public static <T> double partOf(Collection<T> collection, Predicate<T> predicate) {
		final long count = collection.stream()
				.filter(predicate)
				.count();

		return 100.0 * count / collection.size();
	}
}
