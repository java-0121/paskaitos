package com.vcs.lects.l07.objects.references;

public class References {

	void method1() {

		Sveikasis sv = new Sveikasis();
		sv.setSk1(1);
		sv.setSk2(2);

		int sk3 = 3;
		Integer sk4 = 4;

		print(sv.getSk1(), sv.getSk2(), sk3, sk4);

		method2(sv, sk3, sk4);

		System.out.println();

		print(sv.getSk1(), sv.getSk2(), sk3, sk4);

	}

	void method2(Sveikasis s1, int s3, Integer s4) {

		s1.setSk1(s1.getSk1() + 1);
		s1.setSk2(s1.getSk2() + 1);

		s3++;

		// s4++;
		s4 = s4 + 1;
		s4 = Integer.valueOf(s4.intValue() + 1);

	}

	private void print(Integer... sk) {
		for (Integer integer : sk) {
			System.out.println(integer);
		}

	}
	
	
	
	
	

}
