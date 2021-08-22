package com.sda.advanced.solution.zad32.marek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ElementWriter {

	public static void write(List<Model> elements) {
		Path path = Path.of("src", "main", "resources");
		String inputFileName = "elements.txt";
		List<String> toWrite = new ArrayList<>();

		for (Model model : elements
		) {
			toWrite.add(model.getString() + ";" + model.getInteger() + ";");
		}

		try {
			Files.write(path.resolve(inputFileName), toWrite);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}