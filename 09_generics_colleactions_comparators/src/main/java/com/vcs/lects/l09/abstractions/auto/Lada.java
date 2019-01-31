package com.vcs.lects.l09.abstractions.auto;

import com.vcs.lects.l09.abstractions.engines.Benzinas;

public class Lada extends Automobilis<Benzinas> {

	public Lada() {
		variklis = new Benzinas();
	}

	@Override
	public void judeti() {
		// TODO Auto-generated method stub

	}

}
