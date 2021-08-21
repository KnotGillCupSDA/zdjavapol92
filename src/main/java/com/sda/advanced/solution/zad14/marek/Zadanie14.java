package com.sda.advanced.solution.zad14.marek;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Zadanie14 {

	int array[];

	public Zadanie14(int bound) {
		array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = random.nextInt(bound);
		}
	}

	public Set<Integer> getUniqueElements() {
		Set<Integer> uniqueElements = new HashSet<>();
		for (int element : array
		) {
			uniqueElements.add(element);
		}
		return uniqueElements;
	}

	public Map<Integer, List<Integer>> getFrequencyMapSorted() {
		Map<Integer, List<Integer>> frequencyOfElements = new TreeMap<>();
		Set<Integer> uniqueElements = getUniqueElements();
		for (int element : uniqueElements) {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == element) {
					count++;
				}
			}
			if (frequencyOfElements.containsKey(count)) {
				List<Integer> currentList = frequencyOfElements.get(count);
				currentList.add(element);
				frequencyOfElements.put(count, currentList);
			} else {
				List<Integer> currentList = new ArrayList<>();
				currentList.add(element);
				frequencyOfElements.put(count, currentList);
			}
		}
		return frequencyOfElements;
	}

	public List<Integer> get25MostFrequentElements() {
		Map<Integer, List<Integer>> frequencyOfElements = getFrequencyMapSorted();
		List<List<Integer>> sortedList = new ArrayList<>(frequencyOfElements.values());
		List<Integer> result = new ArrayList<>();
		for (int i = sortedList.size() - 1; i > sortedList.size() - 26; i--) {
			if (result.size() >= 25) {
				break;
			}
			result.addAll(sortedList.get(i));
		}
		return result;
	}
}