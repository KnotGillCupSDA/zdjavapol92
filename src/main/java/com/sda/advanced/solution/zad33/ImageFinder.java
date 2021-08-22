package com.sda.advanced.solution.zad33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ImageFinder {

	private ImageFinder() {
	}

	public static List<String> findImages(Path directory) throws IOException {
		return Files.list(directory)
				.map(Path::getFileName)
				.map(Path::toString)
				.collect(Collectors.toList());
	}

}
