package com.vcs.lects.l03.types;

public class Strings {

	void strings() {

		String str0; // null
		String str1 = ""; // ""
		String str2 = new String(""); // "" - nenaudoti :)
		String str4 = " "; // " "
		String str5 = "text"; // "text"

		// char ch = "3".charAt(0);

		// "".

	}

	void asfsad() {
		String s = "Pirmas";

		// Eilutes iskarpymas pagal indeksus
		String p = s.substring(1, 5); // p="irma", s="Pirmas"

		// grazins pirma surasta simbolio indeksa
		int i = s.indexOf("s"); // i=1
		i = p.indexOf("s"); // i=-1

		/**
		 * "O kas cia gali buti neaisku?" :)
		 * 
		 */

	}

	public String sukeisk() {
		String data = "mama";

		data = data.replaceAll("m", "t");
		data = data.replaceAll("a", "ė");

		return data;
	}
	
	
	void paskutinis(String str) {
		
		int lastIndex = str.length() - 1;
		char ch  = str.charAt(lastIndex);
		
		System.out.println(  ch  );
		
		
		System.out.println(  str.charAt(str.length() - 1)  );
		
		
	}

}




















