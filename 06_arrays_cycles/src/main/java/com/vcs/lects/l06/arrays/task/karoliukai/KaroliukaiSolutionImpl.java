package com.vcs.lects.l06.arrays.task.karoliukai;

public class KaroliukaiSolutionImpl {

	public static final char EMPTY = '.';

	public char[][] rotateClockwise(char[][] data, int rotateCount) {

		for (int i = 0; i < rotateCount; i++) {

			doGravity(data);
			data = rotateOneTime(data);

		}

		return data;

	}

	private void doGravity(char[][] data) {
		int gapToFall = 0;
		for (int row = 0; row < data.length; row++) {

			gapToFall = howFarItShouldFall(row, data);

			if (gapToFall > 0) {
				letItFall(row, gapToFall, data);
			}
		}
	}

	private void letItFall(int row, int gapToFall, char[][] data) {

		char[] rowArr = data[row];

		// Lets move data to the end
		for (int i = rowArr.length - 1; i >= gapToFall; i--) {
			rowArr[i] = rowArr[i - gapToFall];
		}

		// Fill the beginning of empty characters
		for (int i = 0; i < gapToFall; i++) {
			rowArr[i] = EMPTY;
		}
	}

	private int howFarItShouldFall(int row, char[][] data) {
		char[] rowArr = data[row];
		int gapToFall = 0;
		for (int i = rowArr.length - 1; i > 0; i--) {

			if (rowArr[i] == EMPTY) {
				gapToFall++;
			} else {
				break;
			}
		}
		return gapToFall;
	}

	private char[][] rotateOneTime(char[][] data) {

		char[][] rotated = new char[data[0].length][data.length];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				rotated[j][data.length - i - 1] = data[i][j];
			}
		}
		return rotated;
	}
}
