package com.vcs.lects.l06.arrays.task.karoliukai;

public class MazvileImpl extends Karoliukai {

	public static final char EMPTY = '.';

	public char[][] rotateClockwise(char[][] data, int rotateCount) {
		for (int i = 1; i <= rotateCount; i++) {
			data = onlyRotation(data);
			data = onlyDropping(data);
		}
		return data;

	}

	public char[][] onlyRotation(char[][] data) {

		char[][] rotated = new char[data[0].length][data.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				int x = data.length - 1 - i;
				rotated[j][x] = data[i][j];
			}
		}

		return rotated;
	}

	public char[][] onlyDropping(char[][] data) {

		int diff = 0;
		// boolean firstDroped = false;
		for (int j = 0; j < data[0].length; j++) {
			boolean firstDroped = false;
			if (data[data.length - 1][j] == EMPTY) {
				for (int up = data.length - 1; up >= 0; up--) {
					if (data[up][j] != EMPTY && !firstDroped) {
						data[data.length - 1][j] = data[up][j];
						data[up][j] = EMPTY;
						diff = data.length - 1 - up;
						firstDroped = true;
					}
					if (data[up][j] != EMPTY && firstDroped) {
						data[up + diff][j] = data[up][j];
						data[up][j] = EMPTY;
					}
				}
			}
		}

		return data;
	}

}
