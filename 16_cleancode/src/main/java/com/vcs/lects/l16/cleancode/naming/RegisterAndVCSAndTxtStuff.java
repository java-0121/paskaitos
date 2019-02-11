package com.vcs.lects.l16.cleancode.naming;

/**
 * <ul>
 * 
 * 
 * <li>Naming convetion:<b>
 * https://en.wikipedia.org/wiki/Naming_convention_(programming)</b></li>
 * 
 * <li>SOLID principles: <b>https://en.wikipedia.org/wiki/SOLID</b></li>
 * 
 * 
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
 * </ul>
 * 
 * <p>
 * Rekomendacijos, ne taisykles:
 * <li>Metodo ilgis - iki 20 eiluciu.</li>
 * <li>Klases ilgis - iki 200 eiluciu</li>
 * <p>
 * 
 * 
 * 
 * <p>
 * Any fool can write code that a computer can understand. Good programmers
 * write code that humans can understand. — Refactoring: Improving the Design of
 * Existing Code. <b>1999 M. Folwer</b>
 * </p>
 * 
 * <p>
 * Clean code is a code that is written by someone who cares. <b>C. Martin</b>
 * </p>
 * 
 * 
 * <p>
 * When you feel the need to write a comment, first try to refactor the code so
 * that any comment becomes superflous. <b>M. Folwer</b>
 * </p>
 * 
 * 
 * 
 * <h2><b>SOLID</b></h2>
 * <li>Single responsibility principle</li>
 * <li>Open/closed principle</li>
 * <li>Liskov substitution principle</li>
 * <li>Interface segregation principle</li>
 * <li>Dependency inversion principle</li>
 * 
 * 
 * <li>Single responsibility principle: Kaip nustatyti jog klase yra per didele?
 * Kai nsudetinga parinkti pavadinima: PersnosSearchAndInit => PersonSearch,
 * PersonInit ir Search (kuri viduje naudoja pirmas dvi)</li>
 * 
 * <li>Open/closed principle: Atveras pletimui / papildymui. Uzdaras
 * modifikacijoms.</li>
 * 
 * <li>Liskov substitution principle: Tipams naudoti kiek imanoma abstraktesni
 * tipa. Jei tik galima neprisiristi prie konkreciu klasiu.</li>
 * 
 * 
 * <li>Interface segregation principle: Geriau turet daugiau mazesniu nei
 * viena/kelis didelius</li>
 * 
 * 
 * <li>Dependency inversion principle</li>
 */

// Pavadinimas inidikuoja jog klase turetu buti jau skaidoma
public class RegisterAndVCSAndTxtStuff {

	// private String VCS;

	/**
	 * Nuoroda i dokumentacia
	 */
	private static final int STARTING_VAL_9_x_5 = 45;

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

		// Nera magic konstantos
		int a = 1;
		int b = 0;

		// Magic numbers
		// int c = 45;

		int c = STARTING_VAL_9_x_5;
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
