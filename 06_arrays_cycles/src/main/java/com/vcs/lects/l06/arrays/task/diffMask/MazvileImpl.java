package com.vcs.lects.l06.arrays.task.diffMask;

public class MazvileImpl {

	public boolean[][] diffMask(int[][] a1, int[][] a2) {
		if (a1.length != a2.length) {
			return null;
		}
		for (int i = 0; i < a1.length; i++) {
			if (a1[i].length != a2[i].length) {
				return null;
			}
		}
		boolean[][] result = new boolean[a1.length][];
		for (int i = 0; i < a1.length; i++) {
			result[i] = new boolean[a1[i].length];
			for (int j = 0; j < a1[i].length; j++) {
				// result[i][j] = a1[i][j] == a2[i][j];
				if (a1[i][j] == a2[i][j]) {
					result[i][j] = true;
				} else {
					result[i][j] = false;
				}

			}
		}
		return result;
	}
}
