package com.sda.advanced.solution.zad4;

import java.util.Collections;
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
		// if so, add value to the existing list
		// if not add new list with 1 element
		if(storage.containsKey(key)) {

		} else {

		}
	}
}
