package com.vcs.lects.l08.inheritance;

public class RealWorld {

	public static void main(String[] args) {

		 (new Tesla() {}).uzvesk();

		TtPriemone[] parkingas = new TtPriemone[20];

		Golf golf = new Golf("1.8", "Raudona");

		// golf.judetiNuoAIkiB(400);

		// golf.setSpalva("Raudona");
		golf.setVariklis("TDI");

		// Tesla tesla = new Tesla();
		// // tesla.setSpalva("Juoda");
		// tesla.setVariklis("elektra");
		// tesla.setAkumTalpa(453);
		//
		// System.out.println(tesla);

		// tesla.ikrauti();

		parkingas[0] = golf;
		parkingas[1] = null;// tesla;
		parkingas[2] = new Toyota("", "") {

			@Override
			public String judeti() {
				return "Nes tai TOYOTA";
			}

		};

		// Anonimine klase
		parkingas[3] = new TtPriemone() {

			@Override
			public void setVariklis(String variklis) {
				// TODO Auto-generated method stub
			}

			@Override
			public String judeti() {

				return "petras pagamino DYI turbo varikli ir pritaise ant dviracio";
			}

			@Override
			public String getVariklis() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getSpalva() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		parkingas[4] = new Avensis("", "") {
			@Override
			public String judeti() {
				return "kjsadkjsadhkajhdskjashdkjashdka";
			}
		};

		for (TtPriemone trPriemone : parkingas) {
			if (trPriemone != null) {
				System.out.println(trPriemone.judeti());
			}

		}

	}

}
