package com.vcs.lects.l16.cleancode.naming.task.solutions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 *
 */
public class AverageFromFileV2 {

	private static final int MAX_VALUES_IN_FILE = 50000;

	public static void main(String[] args) throws IOException {
		AverageFromFileV2 avgCalc = new AverageFromFileV2();
		System.out.println(avgCalc.calc("aaa.txt"));
	}

	public double calc(String pfile) throws IOException {

		File file = new File(pfile);
		List<Integer> duomenys = null;
		if (!file.exists()) {
			duomenys = sukurtiRandomDuomenis();
			irasytiINaujaFaila(file, duomenys);

		} else {
			duomenys = readFile(file);
		}

		return avgCalc(duomenys);
	}

	private void irasytiINaujaFaila(File file, List<Integer> duomenys) throws IOException {
		// file.createNewFile();
		FileUtils.writeLines(file, "UTF-8", duomenys, false);
	}

	private List<Integer> readFile(File file) throws IOException {
		List<Integer> result = new ArrayList<>();
		List<String> lines = FileUtils.readLines(file, java.nio.charset.StandardCharsets.UTF_8);
		for (String dblInStr : lines) {
			result.add(Integer.valueOf(dblInStr));
		}
		return result;

	}

	private List<Integer> sukurtiRandomDuomenis() {
		Random rnd = new Random();
		List<Integer> numbers = new ArrayList<>();

		int maxCount = rnd.nextInt(MAX_VALUES_IN_FILE);
		for (int valCount = 0; valCount < maxCount; valCount++) {
			numbers.add(rnd.nextInt(Integer.MAX_VALUE));
		}
		return numbers;

	}

	private double avgCalc(List<Integer> numbers) {

		double avg = 0;
		for (Integer sk : numbers) {
			avg += 1.0 * sk / numbers.size();
		}
		return avg;

	}

}
