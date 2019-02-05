package com.vcs.lects.l06.arrays.task.average;

public class AverageCalculator {

	public static void main(String... strings) {

		AverageCalculator avg = new AverageCalculator();

		double[] data = { Double.MAX_VALUE, Double.MAX_VALUE };

		System.out.println(avg.calcAverage(data));

	}

	/**
	 * Vidurkio skaiciavimas
	 */

	public double calcAverage(double[] data) {

		double sum = 0;
		for (double d : data) {
			sum += d / data.length;
		}

		return sum;
	}

}
