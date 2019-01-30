package com.vcs.lects.l08.inheritance;

import java.util.Random;

public class RealWorld_ver2 {

	public static void main(String[] args) {

		TrPriemoneImpl tr = atsitiktineMasina();

		/*
		 * Siuo atveju if'as "praeis" kai tr rodys i Heap objektus kaip Model3 arba
		 * Tesla
		 */
		if (tr instanceof Tesla) {
			Tesla tesla = (Tesla) tr;

			System.out.println(tesla.getAkumTalpa());

		} else {
			System.out.println("neturi baterijos");
		}

	}

	private static TrPriemoneImpl atsitiktineMasina() {
		Random rnd = new Random();
		int i = rnd.nextInt(7);
		
		switch (i) {
		case 0: return new Golf("nera","naiski spalva");
		case 1: return new Tesla() {};
		case 2: return new Model3();
		case 3: return new Avensis("yra", "spalvota");
		case 4: return new Rav4();
		case 5: return new Toyota("vvti", "pilka") {};
		case 6: return new TrPriemoneImpl("v12") {};
		}

		return null;
	}

}
