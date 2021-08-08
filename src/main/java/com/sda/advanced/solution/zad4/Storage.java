package com.sda.advanced.solution.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

	private final Map<String, List<String>> storage;

	public Storage() {
		storage = new HashMap<>();
	}

	public void addToStorage(String key, String value) {
		// check if there is already a value under that key
		if(storage.containsKey(key)) {
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

	List<String> findValues(String value) {
		return null;
	}

	List<String> getValues(String key) {
		return storage.get(key);
	}
}
