package com.vcs.lects.l07.inheritance;

public class RealWorld {

	public static void main(String[] args) {

		TRPriemone[] parkingas = new TRPriemone[20];

		Golf golf = new Golf();

	
		//golf.judetiNuoAIkiB(400);

		golf.setSpalva("Raudona");
		golf.setVariklis("TDI");

		Tesla tesla = new Tesla();
		tesla.setSpalva("Juoda");
		tesla.setVariklis("elektra");
		tesla.setAkumTalpa(453);
		
		
		System.out.println(tesla);

		//tesla.ikrauti();

		parkingas[0] = golf;
		parkingas[1] = tesla;
		parkingas[2] = new Toyota();
		parkingas[3] = new TRPriemone();
		parkingas[4] = new Avensis();

		for (TRPriemone trPriemone : parkingas) {
			if (trPriemone != null) {
				trPriemone.judetiNuoAIkiB();
			}

		}

	}

}
