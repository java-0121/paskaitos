package com.vcs.lects.l09.collections.comparators.bank;

public enum Op {

	Grynieji(3), Saskaita(3), Sutartys(1); // Op.BankoApiplesimas(0)

	private int priority;

	Op(int pr) {
		priority = pr;
	}

	public int getPriority() {
		return priority;
	}

}
