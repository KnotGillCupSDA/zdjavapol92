package com.sda.advanced.solution.zad30;

import java.io.FileInputStream;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		final Path zad30Dir = Path.of("src", "main", "resources", "zad30");

		final Path inputFile = zad30Dir.resolve("someTextFile.txt");

		if (!inputFile.toFile().exists()) {
			System.out.println("Plik nie istnieje!");
			return;
		}

		//if file exists
		//read file content
		String content = getFileContent(inputFile);
		System.out.println(content);

		//reverse file content
		String reversedContent = reverseContent(content);
		System.out.println(reversedContent);

		//reverse file name
		Path outputFile = reverseFilename(inputFile);
		System.out.println(outputFile);

		//save reversed content under reversed name
		saveFile(outputFile, reversedContent);
	}

	private static String getFileContent(Path inputFile) {
		return null;
	}

	private static String reverseContent(String content) {
		return null;
	}

	private static Path reverseFilename(Path inputFile) {
		return null;
	}

	private static void saveFile(Path outputFile, String reversedContent) {

	}

}
