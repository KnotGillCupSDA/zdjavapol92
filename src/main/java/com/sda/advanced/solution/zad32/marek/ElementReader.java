package com.sda.advanced.solution.zad32.marek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ElementReader {
	public static void read() {
		Path path = Path.of("src", "main", "resources");
		String inputFileName = "elements.txt";

		try {
			List<String> lines = Files.readAllLines(path.resolve(inputFileName));
			for (String element : lines
			) {
				String[] line = element.split(";");
				System.out.println("Wartosc stringa to: " + line[0] + ", a wartosc integera to " + line[1] + ".");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}