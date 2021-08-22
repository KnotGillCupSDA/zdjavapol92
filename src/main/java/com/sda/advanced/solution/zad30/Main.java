package com.sda.advanced.solution.zad30;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		final Path zad30Dir = Path.of("src", "main", "resources", "zad30");

		final Path inputFile = zad30Dir.resolve("someTextFile.txt");

		if (!inputFile.toFile().exists()) {
			System.out.println("Plik nie istnieje!");
			return;
		}

		//if file exists
		//read file content
		List<String> content = getFileContent(inputFile);
		System.out.println(content);

		//reverse file content
		List<String> reversedContent = reverseContent(content);
		System.out.println(reversedContent);

		//reverse file name
		Path outputFile = reverseFilename(inputFile);
		System.out.println(outputFile);

		//save reversed content under reversed name
		saveFile(outputFile, reversedContent);
	}

	private static List<String> getFileContent(Path inputFile) throws IOException {
		return Files.readAllLines(inputFile, StandardCharsets.UTF_8);
	}

	private static List<String> reverseContent(List<String> content) {
		return content.stream()
				.map( s -> new StringBuilder(s).reverse().toString())
				.collect(Collectors.toList());
	}

	private static Path reverseFilename(Path inputFile) {
		final String reversedName = new StringBuilder(inputFile.toFile().getName()).reverse().toString();
		return inputFile.getParent().resolve(reversedName);
	}

	private static void saveFile(Path outputFile, List<String> content) throws IOException {
		Files.write(outputFile, content, StandardCharsets.UTF_8);
	}

}
