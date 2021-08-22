package com.sda.advanced.solution.zad33;

import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {

		final Path rootDir = Path.of("src", "main", "resources", "zad33");

		System.out.println(ImageFinder.findImages(rootDir));
	}
}