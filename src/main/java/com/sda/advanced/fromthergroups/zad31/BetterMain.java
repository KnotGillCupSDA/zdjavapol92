package com.sda.advanced.fromthergroups.zad31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class BetterMain {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> counter = new HashMap<>();

        Path path = Paths.get("src", "main", "resources", "zad31");
        String fileName = "veryLongFile.txt";

        //we have to close the stream based on IO channel
        try (Stream<String> lines = Files.lines(path.resolve(fileName))) {
            lines
                    .map(line -> line.replaceAll("[^\\p{L}\\s]", ""))
                    .map(line -> line.split(" "))
                    .flatMap(Stream::of)
                    .forEach(s -> counter.compute(s, (k, v) -> v == null ? 1 : v + 1));
        }

        System.out.println(counter);
    }
}
