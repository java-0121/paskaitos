package com.vcs.lects.l04.operators;

public class Palyinimo {

	
	void palygOperatoriai() {
		
		
		double d1 = 1.67777;
		double d2 = 1.67777;
		
		
		boolean arLygus = Double.compare(d1, d2) == 0;
		
		
		int i1 = 2;
		int i2 = 6;
		
		
		arLygus = i1 == i2; // false
		arLygus = i1 == (i2 / 3); // true
		arLygus = i1 != (i2 / 3); // false
		
		arLygus = 2 != 4; // true
		
		
	}
	
}




