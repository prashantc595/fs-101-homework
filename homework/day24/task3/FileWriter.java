package com.xebia.day24.task3;

import java.io.*;

public class FileWriter {

	private FileWriterInterface file = (String text) -> {
		try {
			FileWriter myWriter = new FileWriter("C:/File.txt");
			myWriter.write(text);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			return text;
		} catch (IOException e) {
			throw new FileNotFoundException();
		}
	};

	public FileWriterInterface getFile() {
		return file;
	}

	public void setFile(FileWriterInterface file) {
		this.file = file;
	}
}
