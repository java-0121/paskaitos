package com.vcs.lects.l09.abstractions.auto;

import com.vcs.lects.l09.abstractions.engines.Elektra;

public class Tesla extends Automobilis<Elektra> {

	
	public Tesla() {
		variklis = new Elektra();
	}
	
	@Override
	public void judeti() {
		// TODO Auto-generated method stub

	}

}
