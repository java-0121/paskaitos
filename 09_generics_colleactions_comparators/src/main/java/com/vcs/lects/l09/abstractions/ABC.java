package com.vcs.lects.l09.abstractions;

public class ABC extends Automobilis implements Plaukimas {

	@Override
	public String variklis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void judeti() {
		// TODO Auto-generated method stub

	}

	public void plaukti() {
		Plaukimas impl = new PlaukimasImpl();

		impl.plaukti();

	}

}
