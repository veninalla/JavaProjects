package com.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileDemo {
	private String fileName;
	private String outputFileName;

	public FileDemo(String fileName) {
		this.fileName = fileName;
	}
	public FileDemo(String fileName, String outputFileName) {
		this.fileName = fileName;
		this.outputFileName = outputFileName;
	}
	public int wordCount() throws IOException {
		File file = new File(this.fileName);
		BufferedReader reader = null;
		int totalWords = 0;
		try {
			InputStream in = new FileInputStream(file);
			reader = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = reader.readLine()) != null) {
				totalWords = totalWords + line.split(" ").length;
			}
		} catch (IOException x) {
			System.err.println(x);
		} finally {
			reader.close();
		}

		return totalWords;

	}

	public int stringCount(String word) {

		File file = new File(this.fileName);

		int totalNumber = 0;

		try {
			InputStream in = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;

			while ((line = reader.readLine()) != null) {
				String words[] = line.split(" ");

				for (int i = 0; i < words.length; i++) {
					if (words[i].equals(word) || words[i].equals(word + ".")) {

						totalNumber = totalNumber + 1;
					}
				}
			}
			reader.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return totalNumber;

	}
	public void strReplace(String str1, String str2) throws IOException {
		File file = new File(this.fileName);
		BufferedReader reader = null;
		FileOutputStream out = null;
		int totalWords = 0;
		try {
			InputStream in = new FileInputStream(file);
		    out = new FileOutputStream(this.outputFileName);
			reader = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String replaced = line.replaceAll(str1, str2);
				out.write(replaced.getBytes());
			}
		} catch (IOException x) {
			System.err.println(x);
		} finally {
			reader.close();
			out.close();
		}


	}

	public String getFileName() {
		return fileName;
	}
}
