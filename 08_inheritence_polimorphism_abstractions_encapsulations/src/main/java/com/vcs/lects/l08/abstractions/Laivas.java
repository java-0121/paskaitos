package com.vcs.lects.l08.abstractions;

public class Laivas extends TrPriemone implements Plaukimas {

	@Override
	public void judeti() {
		// TODO Auto-generated method stub

	}

	@Override
	public int vietuKiekis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void plaukti() {
		Plaukimas impl = new PlaukimasImpl();

		impl.plaukti();

	}

}
