package com.vcs.lects.l09.abstractions;

public class Laivas extends TrPriemone implements Plaukimas {

	@Override
	public void judeti() {
		// TODO Auto-generated method stub

	}

	@Override
	public void plaukti() {
		Plaukimas impl = new PlaukimasImpl();

		impl.plaukti();

	}

}
