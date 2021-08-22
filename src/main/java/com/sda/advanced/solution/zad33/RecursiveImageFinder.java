package com.sda.advanced.solution.zad33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RecursiveImageFinder {

	private RecursiveImageFinder() {
	}

	public static List<String> findImages(Path directory) {

		List<String> allImages = new ArrayList<>();

		File[] files = directory.toFile().listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					allImages.addAll(findImages(file.toPath()));
				} else {
					if (file.getName().endsWith(".png")
							|| file.getName().endsWith(".jpg")) {
						allImages.add(file.getName());
					}
				}
			}
		}

		return allImages;
	}

}
