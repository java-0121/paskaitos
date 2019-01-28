package com.vcs.lects.l06.arrays.task.karoliukai;

public class Karoliukai {

	public static final char EMPTY = '.';

	public static void main(String[] args) {

		char[][] c = { 
				{ EMPTY, 'X', 'X', EMPTY }, 
				{ EMPTY, EMPTY, 'A', EMPTY }, 
				{ 'Q', EMPTY, 'Z', EMPTY },
				{ 'M', EMPTY, 'A', 'M' }, };

		Karoliukai k = new Karoliukai();
		k.dataToConsole(c);
		
		c = k.rotateClockwise(c, 1);
		
		System.out.println();
		
		k.dataToConsole(c);
	}

	/**
	 * "data" masyvo duomenys:
	 * 
	 * <pre>
	 * 
	 * 5x5:
	 * 
	 * _0_00
	 * 0_000
	 * 0__0_
	 * __0__
	 * _00__
	 * 
	 * </pre>
	 * 
	 * pavertus vieną kartą pagal laikrodžio rodyklę:
	 * 
	 * <pre>
	 * 
	 * ___0_
	 * __0_0
	 * ___0_
	 * 0__00
	 * 00000
	 * 
	 * </pre>
	 * 
	 * Karoliukai turi "sukristi" žemyn, bet jei buvo tarpų tarp karoliukų - jie
	 * turi išlikti.
	 * 
	 * @param data
	 *            karoliuku pradinis išdėstymas
	 * @param rotateCount
	 *            apvertimų kiekis pagal laikrodžio rodyklę
	 * @return paverstas "vaizdas"
	 */
	public char[][] rotateClockwise(char[][] data, int rotateCount) {

		// TODOO
		return data;

	}




	/**
	 * Pagalbinis metodas duomenu isvedimui
	 * 
	 * @param data
	 */
	public void dataToConsole(char[][] data) {

		String line = "";
		for (int x = 0; x < data.length; x++) {
			line = "";
			for (int y = 0; y < data[0].length; y++) {
				line += data[x][y];
			}

			System.out.println(" " + line);
		}

	}

}
