package com.sda.advanced.solution.zad4;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StorageTest {

	private Storage storage;

	@BeforeEach
	void setUp() {
		storage = new Storage();
	}

	@Test
	void shouldAddMultipleValuesUnderTheSameKey() {
		final String key = "key1";
		storage.addToStorage(key, "value1");
		storage.addToStorage(key, "value2");
		storage.addToStorage("key2", "value3");
		storage.addToStorage(key, "value4");

		storage.printValues("key2");

		assertThat(storage.getValues(key))
				.containsExactly("value1", "value2", "value4");
	}

	@Test
	void shouldFindKeysByValue() {
		storage.addToStorage("key1", "value1");
		storage.addToStorage("key1", "value2");
		storage.addToStorage("key2", "value1");
		storage.addToStorage("key2", "value3");
		storage.addToStorage("key3", "value1");

		assertThat(storage.findValues("value1"))
				.containsExactlyInAnyOrder("key1", "key2", "key3");
		assertThat(storage.findValues("value2"))
				.containsExactlyInAnyOrder("key1");
		assertThat(storage.findValues("value3"))
				.containsExactlyInAnyOrder("key2");
	}

	@Test
	void shouldReturnEmptyListForNotExistingValues() {
		storage.addToStorage("key1", "value1");

		final List<String> values = storage.findValues("not-existing-value");
		assertThat(values)
				.isNotNull()
				.isEmpty();
	}
}