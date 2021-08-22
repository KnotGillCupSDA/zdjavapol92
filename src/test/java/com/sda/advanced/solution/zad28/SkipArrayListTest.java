package com.sda.advanced.solution.zad28;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class SkipArrayListTest {

	@Test
	void happyPath() {
		SkipArrayList<String> skipArrayList = new SkipArrayList<>();
		skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));

		List<String> skippedList = skipArrayList.getEveryNthElement(2, 3);

		assertThat(skippedList).containsExactly("c", "g");
	}
}