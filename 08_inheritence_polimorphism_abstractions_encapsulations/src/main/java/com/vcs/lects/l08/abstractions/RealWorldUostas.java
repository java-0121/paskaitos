package com.vcs.lects.l08.abstractions;

import java.util.Random;

public class RealWorldUostas {

	public static void main(String[] args) {

		
		TrPriemone[] eile = atvyko();
		
		for (TrPriemone trPriemone : eile) {
			if (trPriemone instanceof Plaukimas) {
				System.out.println("Plauk: " + trPriemone.getClass().getSimpleName());
				((Plaukimas)trPriemone).plaukti();
			} else {
				System.out.println("Stop! Nuskesi: " + trPriemone.getClass().getSimpleName());
			}
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static TrPriemone[] atvyko() {
		TrPriemone[] priemones = { new ABC(), new BMW(), new Lada(), new Laivas(), new OroBalionas() };
		return priemones;
	}

}
