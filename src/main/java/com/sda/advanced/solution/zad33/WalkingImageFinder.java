package com.sda.advanced.solution.zad33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WalkingImageFinder {

	public static List<String> findImages(Path directory) throws IOException {
		try(final Stream<Path> walk = Files.walk(directory)) {
			return walk
					.map(Path::toFile)
					.filter(image -> image.getName().endsWith(".png") || image.getName().endsWith(".jpg"))
					.map(File::getName)
					.collect(Collectors.toList());
		}
	}
}
