package com.vcs.lects.l03.types;

public class JavaTypes {
	
	// Cia konstanta :) ... ne "const"
	public static final double PI_CONST = 3.14;
	
	

	private final int amzius = 22;

	private byte b01;

	void javaTypes() {

		int skaicius; // 0
		Integer skaiciusWr; // null

		byte b1 = 100;
		Byte b2 = 4;

		byte b3 = Byte.MAX_VALUE;

		short sh1 = 435;
		sh1 = Short.MAX_VALUE;

		int sk01 = 456;
		Integer ii1 = 435 + sk01;

		Integer ii4 = 15 + 6;

		long lng1 = 3253245;

		char ch1 = 63;

		// http://www.asciitable.com/
		System.out.println(ch1);

		char ch2 = 'A';

		System.out.println(ch2);

		ch2 = 'A' + 1;

		long lng2 = 4_353_453_453L;

		/**
		 * su kableliais
		 * 
		 */

		double dl = 0.00000000001;

		Double dl2 = 435.657;

		float fl1 = 435.456f;

		Float fl2 = 3.3453f;

		fl2 = null;

		// NullPointerException
		// fl1 = fl1 + fl2;

		/**
		 * boolean
		 * 
		 */

		boolean bl3; // false

		boolean bl1 = false;
		bl1 = true;

		Boolean bl2 = false;
		bl2 = true;
		bl2 = null;

	}

	void aaa() {

		int a = 0;
		Integer aa = a;

	}

	void casting() {

		int i = 300;

		byte b = 2;

		// i = b; // Ok

		b = (byte) i; // cia galimas duomenu praradimas

		System.out.println(b);

	}

	void conversijos() {

		byte atstumas = 5;

		long milimetras = atstumas;
		long metras = milimetras * 1000;
		long kilometras = metras * 1000;
		long tukstKm = kilometras * 1000;

		System.out.println(tukstKm);
		System.out.println(kilometras);
		System.out.println(metras);
		System.out.println(milimetras);

	}

	// Hack :)
	public double vidurkis(int suma, int kiekis) {
		return 1.0 * suma / kiekis;
	}

}
