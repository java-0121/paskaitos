package com.vcs.lects.l09.abstractions;

public class RealWorldv3 {

	public static void main(String[] args) {

		BMW bmw = new BMW();

		Lada lada = new Lada();
		
		// Nesikompiliuos
		//TrPriemone kazkas = new TrPriemone();
		TrPriemone kazkas = new Lada();
		
		
		Automobilis auto = new BMW();
		
		

		Laivas l = new Laivas();
		l.judeti();
		
		
		ivaziavimasiParkinga(lada, kazkas, bmw);
		
		
	}

	private static void ivaziavimasiParkinga(TrPriemone ... parkingas) {
		
		
		
		
	}

}
