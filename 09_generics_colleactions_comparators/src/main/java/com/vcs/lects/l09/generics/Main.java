package com.vcs.lects.l09.generics;

public class Main {

	public static final void main(String... strings) {

		ManoWrapperis<ManoTipas> mt = new ManoWrapperis<ManoTipas>(new ManoTipas());

		ManoWrapperis<Integer> i = new ManoWrapperis<Integer>(0);

		System.out.println(i.rezultatas());

		ManoWrapperisObj o = new ManoWrapperisObj(new Integer(7));
		ManoWrapperisObj omt = new ManoWrapperisObj(new Object());
		System.out.println(o.rezultatas());

		System.out.println(mt.rezultatas().getStr());
		System.out.println(
				(omt.rezultatas() instanceof ManoTipas ? ((ManoTipas) omt.rezultatas()).getStr() : omt.rezultatas()));

	}

}
