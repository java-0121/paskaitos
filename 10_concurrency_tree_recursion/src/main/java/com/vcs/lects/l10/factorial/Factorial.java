package com.vcs.lects.l10.factorial;

public class Factorial {

	public static final void main(String... strings) {

		Factorial f = new Factorial();
		System.out.println(f.factorial(3));

	}

	public long factorial(long sk) {

		if (sk > 1) {
			return sk * factorial(sk - 1L);
		}

		return 1L;
	}

}
