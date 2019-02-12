package com.vcs.lects.l16.cleancode.naming.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class AverageFromFile {

	public double calc(String fileParam) throws IOException {

		File file = new File(fileParam);

		if (file.exists()) {
			Reader reader = new FileReader(file);

			BufferedReader buffReader = new BufferedReader(reader);
			String line = buffReader.readLine();

			System.out.println("Failo turinys:");
			int counter = 0;

			Integer avg = 0;
			while (null != line && !line.isEmpty()) {
				avg += Integer.getInteger(line);
				System.out.println("" + ++counter + " ) " + line);
				line = buffReader.readLine();
			}
			buffReader.close();
			System.out.println("Pabaiga");
			return avg;

		} else {
			file.createNewFile();
			System.out.println("Sukure: " + file.getAbsolutePath());

			FileWriter fw = new FileWriter(file, true);
			Random rnd = new Random();
			int maxCount = rnd.nextInt(200 * 250);

			for (int i = 0; i < maxCount; i++) {

				fw.write( rnd.nextInt(Integer.MAX_VALUE));
				fw.write("\n");

			}
			fw.flush();
			fw.close();

			File ff = new File(fileParam);
			BufferedReader buffReader = new BufferedReader(new FileReader(ff));
			String line = buffReader.readLine();
			double avg = 0;

			while (null != line && !line.isEmpty()) {
				avg += Integer.getInteger(line) / line.length();
				line = buffReader.readLine();
			}
			buffReader.close();

			return avg;
		}

	}

	// public static void main(String[] args) throws IOException {
	// System.out.println(calc("aaa.txt"));
	// }
}
