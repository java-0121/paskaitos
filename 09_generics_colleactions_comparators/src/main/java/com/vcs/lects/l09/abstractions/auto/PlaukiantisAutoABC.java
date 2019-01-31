package com.vcs.lects.l09.abstractions.auto;

import com.vcs.lects.l09.abstractions.Plaukimas;
import com.vcs.lects.l09.abstractions.PlaukimasImpl;
import com.vcs.lects.l09.abstractions.engines.Benzinas;

public class PlaukiantisAutoABC extends Automobilis<Benzinas> implements Plaukimas {

	public PlaukiantisAutoABC() {
		variklis = new Benzinas();
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
