package com.vcs.lects.l08.inheritance;

public class Golf extends TrPriemoneImpl {

	public Golf(String variklis, String spalva) {
		super(variklis, spalva);

	}

	@Override
	public String judeti() {
		// Kvieciam tevines klases metoda, passimam to metodo reiksme, ja papildom
		return super.judeti() + " (golf way)";
	}

}
