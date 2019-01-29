package com.vcs.lects.l07.objects.references;

public class References2 {
	
	public static void main(String ...strings ) {
		
		new References2().aaa();
		
	}

	void aaa() {

//		Sveikasis abc1 = new Sveikasis();
//		abc1.setSk1(0);
		Integer abc1 = 0;

//		Sveikasis abc2 = new Sveikasis();
//		abc2.setSk1(10);
		Integer abc2 = 10;

		Integer abc3 = null;
		Integer abc4 = null;

		abc1 = abc4;
		abc3 = abc2;
		abc2 = abc1;
		abc1 = abc3;

		//abc4.setSk1(5);
		//abc4 = 5;

		
		System.out.println(abc1); // 10
		System.out.println(abc2); // 5
		System.out.println(abc3); // 10
		System.out.println(abc4); // 5
		
//		System.out.println(abc1.getSk1()); // 10
//		System.out.println(abc2.getSk1()); // 5
//		System.out.println(abc3.getSk1()); // 10
//		System.out.println(abc4.getSk1()); // 5

	}

}
