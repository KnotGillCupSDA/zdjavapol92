package com.sda.advanced.solution.zad32;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public abstract class AbstractCarStorage {

	protected final Path dbFile;

	public AbstractCarStorage(Path directory) {
		this.dbFile = directory.resolve("cars.db");
	}

	public abstract List<Car> load() throws IOException;

	public abstract void save(List<Car> cars) throws IOException;

}
