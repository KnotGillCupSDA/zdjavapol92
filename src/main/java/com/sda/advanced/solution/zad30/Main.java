package com.sda.advanced.solution.zad30;

import java.io.FileInputStream;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		final Path zad30Dir = Path.of("src", "main", "resources", "zad30");
		final Path inputFile = zad30Dir.resolve("someTextFile.txt");

		final Path outputFile = zad30Dir.resolve("output.txt");


	}

}
