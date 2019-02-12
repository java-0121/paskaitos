package com.vcs.lects.l16.cleancode.naming.task.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Hello world! I first time see java and I code awesome. Cheers :)
 *
 */
public class AverageFromFileV1 {

	public static void main(String[] args) throws IOException {
		AverageFromFileV1 avgCalc = new AverageFromFileV1();

		System.out.println(avgCalc.calc("aaa.txt"));
	}

	public double calc(String pfile) throws IOException {

		File file = new File(pfile);

		if (!file.exists()) {
			sukurtiFailaSuDuomenimis(file);
		}

		return readDataAndCalcAvg(file);
	}

	private double readDataAndCalcAvg(File file) throws IOException {
		BufferedReader buffReader = new BufferedReader(new FileReader(file));

		try {
			return avgCalcFromFile(buffReader);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			buffReader.close();
		}
		return 0;

	}

	private void sukurtiFailaSuDuomenimis(File file) throws IOException {
		file.createNewFile();
		System.out.println("Sukure: " + file.getAbsolutePath());

		FileWriter fw = new FileWriter(file, true);
		Random rnd = new Random();

		int maxCount = rnd.nextInt(450);
		for (int valCount = 0; valCount < maxCount; valCount++) {
			fw.write("" + rnd.nextInt(Integer.MAX_VALUE));
			fw.write("\n");
		}

		fw.flush();
		fw.close();

	}

	private double avgCalcFromFile(BufferedReader buffReader) throws IOException {
		// BufferedReader buffReader = new BufferedReader(new FileReader(ff));
		String line = buffReader.readLine();
		int sum = 0;

		int counter = 0;

		while (null != line && !line.isEmpty()) {
			sum += Integer.valueOf(line);
			line = buffReader.readLine();
			counter++;
		}
		return sum / counter;

	}

}
