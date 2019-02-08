package com.vcs.lects.l06.arrays.task.sort;

public class NumbersOrdering {

	/**
	 * @param numbersString
	 *            - cia kaip PVZ:<b>"3242 43 234234 34 234243423 234 234"</b>
	 * @param naturalOrder
	 *            - jeigu true: didejimo tvrka, jeigu false: mazejimo
	 * @return int tipo masyvas isrikiuotas didejimo / mazejimo tvarka
	 */

	public int[] sort(String data, boolean ascending) {

		int[] dataInt = parseData(data);

		return sortArray(dataInt, ascending);
	}

	private int[] sortArray(int[] dataInt, boolean ascending) {

		int indexWithMinVal = 0;
		for (int i = 0; i < dataInt.length; i++) {

			indexWithMinVal = findIndexWithExremum(i, dataInt, ascending);
			swapValuesInArr(dataInt, i, indexWithMinVal);
		}

		return dataInt;
	}

	private void swapValuesInArr(int[] dataInt, int index1, int index2) {

		int temp = dataInt[index1];
		dataInt[index1] = dataInt[index2];
		dataInt[index2] = temp;

	}

	private int findIndexWithExremum(int startSearchIndex, int[] dataInt, boolean ascending) {

		int currentVal = (ascending ? Integer.MAX_VALUE : Integer.MIN_VALUE);
		int newValIndex = 0;
		for (int i = startSearchIndex; i < dataInt.length; i++) {
			if ((ascending && dataInt[i] < currentVal) || (!ascending && dataInt[i] > currentVal)) {
				currentVal = dataInt[i];
				newValIndex = i;
			}
		}

		return newValIndex;
	}

	private int[] parseData(String data) {

		String[] strs = data.split(" ");

		int[] result = new int[strs.length];

		for (int i = 0; i < strs.length; i++) {
			result[i] = Integer.parseInt(strs[i]);
		}

		return result;
	}

}
