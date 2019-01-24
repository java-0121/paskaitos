package com.vcs.lects.l04.operators;

public class Operators {

	void operatoriai() {

		int sk = 10;

		sk = sk + 5;
		sk += 5;
		sk++; // padidinam vienetu: sk = sk + 1;
		++sk; // padidinam vienetu: sk = sk + 1;

		sk = sk - 1;
		sk -= 1;
		sk--;
		--sk;

		sk = 10;
		int result = 3 + sk++;

		sk = 10;
		result = 3 + ++sk;

		sk = sk / 2;
		sk /= 2;

		sk = sk * 3;
		sk *= 3;

		sk = sk % 4;
		sk %= 4;

		double r = Math.sqrt(sk);

	}

	public void penkiSk() {
		int sk = 0;
		printSk(sk);
		printSk(++sk);
		printSk(sk);
		printSk(sk++);
		printSk(sk);
	}

	private void printSk(int i) {
		System.out.println(i);
	}

	public boolean arLyginis(int sk) {
		return sk % 2 == 0;
	}

	private boolean arNelyginis(int sk) {

		return !arLyginis(sk);
	}

	public void stringPatikrinimas(String str) {

		if (str != null && !str.isEmpty() && !str.trim().isEmpty()) {
			System.out.println(str.trim());
			return;
		}

		System.out.println("nera teksto");

	}

	public boolean stringsCheck() {
		return method("null") && method("") && method(null);

	}

	public boolean method(String text) {
		System.out.println("text: " + text);
		return text != null && !text.isEmpty();
	}

}
