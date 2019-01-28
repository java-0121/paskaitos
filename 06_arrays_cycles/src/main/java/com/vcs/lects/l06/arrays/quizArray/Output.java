package com.vcs.lects.l06.arrays.quizArray;

public class Output {

	String[] vardai = { "Justina", "Andrius", "Mindaugas", "Arminas", "Martynas", "Tomas" };

	public void output() {
		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[i]);
		}

		// Atgalinis
		for (int i = vardai.length; i > 0; --i) {
			System.out.println("Vardas    : " + vardai[i]);
		}
		// Atgalinis
		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[vardai.length - i - 1]);
		}

		// Amzinas ciklas
		for (;;) {
			
		}
		
		
	}

}
