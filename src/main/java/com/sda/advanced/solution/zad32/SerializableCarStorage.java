package com.sda.advanced.solution.zad32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class SerializableCarStorage extends AbstractCarStorage {

	public SerializableCarStorage(Path directory) {
		super(directory);
	}

	@Override
	public List<Car> load() throws IOException {
		try (ObjectInput ois = new ObjectInputStream(new FileInputStream(dbFile.toFile()))) {
			try {
				return (List<Car>) ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		return Collections.emptyList();
	}

	@Override
	public void save(List<Car> cars) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbFile.toFile()))) {
			oos.writeObject(cars);
		}
	}
}
