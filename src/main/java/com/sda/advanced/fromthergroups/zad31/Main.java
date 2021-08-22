package com.sda.advanced.fromthergroups.zad31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Path zad31Dir = Paths.get("src", "main", "resources", "zad31");
        Path inputFile = zad31Dir.resolve("veryLongFile.txt");

        //read file
        List<String> lines = Files.readAllLines(inputFile);

        //count occurrences
        Map<String, Integer> counters = countWords(lines);

        //write occurrences to file
        Files.writeString(zad31Dir.resolve("counters.txt"), format(counters), StandardOpenOption.CREATE);
    }

    private static String format(Map<String, Integer> counters) {
        return counters.entrySet().stream()
                .map(e -> e.getKey() + " => " + e.getValue())
                .collect(Collectors.joining(System.lineSeparator()));
    }

    private static Map<String, Integer> countWords(List<String> lines) {
        Map<String, Integer> mapList = new HashMap<>();
        for (String s : lines) {
            String[] line = s.split("\\s+");
            for (String value : line) {
                String normalizedValue = value.replaceAll("[^0-9a-zA-ZĄąĆćĘęŁłŃńÓóŚśŹźŻż]", "").trim();
                if(!normalizedValue.isBlank()) {
                    if (mapList.containsKey(normalizedValue)) {
                        mapList.put(normalizedValue, mapList.get(normalizedValue) + 1);
                    } else {
                        mapList.put(normalizedValue, 1);
                    }
                }
            }
        }
        return mapList;
    }
}
