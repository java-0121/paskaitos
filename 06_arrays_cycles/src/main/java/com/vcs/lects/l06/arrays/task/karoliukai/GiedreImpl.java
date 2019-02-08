package com.vcs.lects.l06.arrays.task.karoliukai;

public class GiedreImpl extends Karoliukai {

	public static void main(String[] args) {

		char[][] mas1 = { { ' ', ' ', ' ', ' ', 'o' }, { ' ', 'o', ' ', ' ', ' ' }, { 'o', ' ', 'o', ' ', ' ' },
				{ 'o', ' ', ' ', ' ', ' ' }, { ' ', ' ', 'o', ' ', 'o' }, { 'o', 'o', 'o', ' ', 'o' } };

		int h = mas1.length; // 6 5
		int l = mas1[h - 1].length;

		// <PASUKIMO METODAS> SITAM METODE REIKALINGI 2 KINTAMIEJI
		// NAUJAS TUSCIAS PASUKTAS MASYVAS
		char[][] mas2 = new char[l][h]; // 5 6
		int h2 = mas2.length;
		int l2 = mas2[h2 - 1].length;

		// PERRASYMAS IS SENO I NAUJA PASUKTA MASYVA
		for (int i = 0; i < mas1.length; i++) { // per eilutes nuo 0 iki 5
			--l2;

			for (int j = 0; j < mas1[i].length; j++) { // per stulpelius/eilutes elementus 0 iki 4

				mas2[j][l2] = mas1[i][j]; // mas2[0][5] = mas1[0][0]
			}
		}

		// <NUKRITIMO METODAS>
		// TARPU IESKOJIMAS NAUJO MASYVO APATINEJE EILUTEJE
		// RADUS TARPA, RUTULIUKO IESKOJIMAS ATITINKAMAME STULPELYJE I VIRSU
		// STULPELIO ELEMENTU PASLINKIMAS I APACIA PER TIEK, KIEK ZINGSNIU ATLIKTA
		// RANDANT RUTULIUKA (PER b)
		for (int s = 0; s < mas2[mas2.length - 1].length; s++) { // apatines eilutes tikrinimas, eilute i desine iki
																	// paskutinio elemento

			if (mas2[mas2.length - 1][s] == ' ') { // iesko tarpo, tarpas s stulpelyje, eilutes elemento skaicius
				int b = 0;

				for (int z = mas2.length - 2; z >= 0; z--) { // stulpeliu aukstyn nuo pries paskutines eilutes, z yra
																// eilutes sk
					++b; // skaiciuoja zingsnius i virsu, kol randam rutuliuka
					if (mas2[z][s] == 'o') { // iesko rutuliuko, s yra stulpelio sk kur rutuliukas

						for (int q = b; q <= mas2.length - 1; q++) {
							mas2[q][s] = mas2[q - b][s]; // paslinkimas elementu per b zingsniu

						}
						for (int a = 0; a < b; a++) { // uzpildymas tarpais
							mas2[a][s] = ' ';

						}

					}
				}
			}
		}

		// <NAUJO MASYVO SPAUSDINIMO METODAS>
		for (int n = 0; n < mas2.length; n++) { // naujas pavirtes masyvas, stulpeliai patampa eilutem, o eilutes
												// stulpeliais
			for (int m = 0; m < mas2[n].length; m++) {

				System.out.print(mas2[n][m]);
			}
			System.out.println("");
		}

	}

}
