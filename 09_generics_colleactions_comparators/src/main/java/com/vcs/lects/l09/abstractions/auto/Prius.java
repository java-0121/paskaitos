package com.vcs.lects.l09.abstractions.auto;

import com.vcs.lects.l09.abstractions.engines.Hibridas;

public class Prius extends Automobilis<Hibridas> {

	public Prius() {
		variklis = new Hibridas();
	}

	@Override
	public void judeti() {
		// TODO Auto-generated method stub

	}

}
