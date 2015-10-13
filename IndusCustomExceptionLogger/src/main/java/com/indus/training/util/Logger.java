package com.indus.training.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logger {

	private static int value;

	File file = new File("logger.txt");
	static BufferedWriter buffredWriterObj;
	static FileWriter fileWriter;
	static BufferedReader buffredReaderObj;
	static FileReader fileReader;

	public void getInfo() {

		// Pattern patternObj = Pattern.compile("");
		// Matcher matcherObj = patternObj.matcher("");
		//
		// String info = null;
		// try {
		// while ((info = buffReaderObj.readLine()) != null) {
		// matcherObj.appendTail();
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}

	public void getWarnings() {
		// Pattern patternObj = Pattern.compile("");
		// Matcher matcherObj = patternObj.matcher("");

	}

	public void getDebug() {
		// Pattern patternObj = Pattern.compile("");
		// Matcher matcherObj = patternObj.matcher("");
	}

	public void getExceptions() {

		String loggerFileString;
		try {
			fileReader = new FileReader(file);

			buffredReaderObj = new BufferedReader(fileReader);

			StringBuilder sb = new StringBuilder();
			while ((loggerFileString = buffredReaderObj.readLine()) != null) {
				sb.append(loggerFileString);
			}
			loggerFileString = sb.toString();
			Pattern patternObj = Pattern.compile("EXCEPTION time: "
					+ "(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)"
					+ " class com.indus.training.impl.Calculator;");
			Matcher matcherObj = patternObj.matcher(loggerFileString);
			while (matcherObj.find()) {
				System.out.format("Obtained log \"%s\" " + "\n",
						matcherObj.group());
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffredReaderObj.close();
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void getFatal() {
		// Pattern patternObj = Pattern.compile("");
		// Matcher matcherObj = patternObj.matcher("");
	}

	public void saveInfo(String info) throws ClassNotFoundException,
			IOException {
		// fileWriter = new FileWriter(file , true);
		// buffredWriterObj = new BufferedWriter(fileWriter);
		// buffredWriterObj.append("INFO"
		// + Class.forName("com.indus.training.impl.Calculator") + ";\n");
	}

	public void saveWarnings(String warnings) throws ClassNotFoundException,
			IOException {
		// fileWriter = new FileWriter(file);
		// buffredWriterObj = new BufferedWriter(fileWriter);
		// buffredWriterObj.append("WARNING" + "time" + value++
		// + Class.forName("com.indus.training.impl.Calculator") + ";\n");

	}

	public void saveDebug(String debug) {

	}

	public void saveExceptions(String stackTrace) {

		try {
			fileWriter = new FileWriter(file, true);
			buffredWriterObj = new BufferedWriter(fileWriter);
			DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			String some = "EXCEPTION " + "time: " + dateFormat.format(date)
					+ " " + Class.forName("com.indus.training.impl.Calculator")
					+ ";  ";
			char[] charSome = some.toCharArray();

			for (int i = 0; i < charSome.length; i++) {
				buffredWriterObj.append(charSome[i]);
			}
			buffredWriterObj.append("\n");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffredWriterObj.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void saveFatal(String error) throws ClassNotFoundException,
			IOException {
		// fileWriter = new FileWriter(file);
		// buffredWriterObj = new BufferedWriter(fileWriter);
		// buffredWriterObj.append("FATAL" + "time" + value++
		// + Class.forName("com.indus.training.impl.Calculator") + ";\n");

	}

}
