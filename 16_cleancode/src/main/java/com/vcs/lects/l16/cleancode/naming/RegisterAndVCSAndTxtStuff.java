package com.vcs.lects.l16.cleancode.naming;

/**
 * <ul>
 * 
 * <li>Kintamuju pavadinimu ilgis tiesiogiai turetu priuklausyti nuo to
 * kintamojo scope'o</li>
 * <li>Nesikartokim patys saves: Person.getPersonName() => Person.getName()</li>
 * <li>Klases pavadinimas turi atitikti jos turini</li>
 * <li>Jeigu nepavyksta sugalvoti taiklaus klases pavadinimo - refactoring
 * indikacija</li>
 * <li>Jeigu nepavyksta pavadinti metodo - jis daro per daug</li>
 * <li>Blogas kodas daro per daug! Geras kodas - konkreciai ir glaustai</li>
 * <li>Palikti galimybe koda plesti kitiems: vengti static kodo, palikti
 * galimybe keisti esama koda (override). Nedieliokit jokiu final jei to is
 * tikro nereikia</li>
 * <li>Dependencies: reikia reguliariai atnaujinti</li>
 * 
 * <li>Any fool can write code that a computer can understand. Good programmers
 * write code that humans can understand. — Refactoring: Improving the Design of
 * Existing Code, 1999</li>
 * 
 *  <li>Clean code is a code that is written by someone who cares</li>
 * 
 * </ul>
 */

//
public class RegisterAndVCSAndTxtStuff {

	// private String VCS;

	// Saves kartojimas
	private int registerAge = 0;

	// Register's age
	private int age;

	// Person age
	private int personAge = 0;

	private String vCS;

	private String vilniusCodingScool;

	// em... ilgio rekordao besiekiant :D
	private String tekstasPaimtasIsTekstoTresiosDaliesBetNetinkaKitomsVietoms;
	private String tekstasPaimtasIsTekstoTresiosDaliesBetTinkaKitomsVietoms;

	// Not private / global
	private String tekstasNetinka;
	private String tekstasTinka;

	// Local
	private String txtOk;
	private String txtNotOk;

	private String the9thLine;

	public String getVCS() {
		return vCS;
	}

	public void setVCS(String theVCS) {
		vCS = theVCS;
	}

	private void masIsvedimasPatikrinto(int[] mas, int slenkstis) {

		int rez = masyvoPatikrinimas(mas, slenkstis);

		isvedimas(rez);

	}

	private int masyvoPatikrinimas(int[] mas, int slenkstis) {

		int c = 0;
		for (int masEl : mas) {
			if (masEl > slenkstis) {
				c++;
			}
		}
		return c;
	}

	private void isvedimas(int rez) {

		System.out.println(rez);

	}

}
