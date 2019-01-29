package com.vcs.lects.l07.objects.references.strings;

public class StringsDarkSide {

	public static final void main(String... strings) {
		StringsDarkSide asda = new StringsDarkSide();

		asda.abc();
	}

	void abc() {

		String txt = "abc cba";

		// txt = txt + " " + "cba"; //

		String txt2 = "abc cba";

		// TODO
		System.out.println(txt2 == txt);
		System.out.println(txt.equals(txt2));

		/**
		 * WARNING: Dark side (pavojinga taikioms mintims)
		 */

		Integer sk1 = 120;
		Integer sk2 = 120;

		System.out.println();
		System.out.println(sk1 == sk2);
		System.out.println(sk1.equals(sk2));

		Integer sk3 = 130;
		Integer sk4 = Integer.valueOf(130);// 130;

		System.out.println();
		System.out.println(sk3 == sk4);
		System.out.println(sk3.equals(sk4));

	}

}
