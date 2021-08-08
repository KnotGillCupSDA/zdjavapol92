package com.sda.advanced.solution.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

	private final Map<String, List<String>> storage;

	public Storage() {
		storage = new HashMap<>();
	}

	public void addToStorage(String key, String value) {
		// check if there is already a value under that key
		if (storage.containsKey(key)) {
			// if so => add value to the existing list
			final List<String> strings = storage.get(key);
			strings.add(value);
		} else {
			// if not => put new list with 1 element to storage
			final ArrayList<String> strings = new ArrayList<>();
			strings.add(value);
			storage.put(key, strings);
		}
	}

	void printValues(String key) {
		System.out.println(storage.get(key));
	}

	public List<String> findValues_Marek(String searchedValue) {
		List<String> result = new ArrayList<>();
		storage.forEach((key, value) -> {
			if (value.contains(searchedValue)) {
				result.add(key);
			}
		});
		return result;
	}

	public List<String> findValues_Mateusz(String searchedValue) {
		List<String> result = new ArrayList<>();

		for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
			final List<String> values = entry.getValue();
			if (values.contains(searchedValue)) {
				result.add(entry.getKey());
			}
		}

		return result;
	}

	public List<String> findValues(String searchedValue) {
		return storage.entrySet().stream()
				.filter(entry -> entry.getValue().contains(searchedValue))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

	List<String> getValues(String key) {
		return storage.get(key);
	}
}
