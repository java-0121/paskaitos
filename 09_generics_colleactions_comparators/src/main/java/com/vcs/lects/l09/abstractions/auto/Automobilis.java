package com.vcs.lects.l09.abstractions.auto;

import com.vcs.lects.l09.abstractions.TrPriemone;
import com.vcs.lects.l09.abstractions.engines.Variklis;

public abstract class Automobilis<T> extends TrPriemone {

	protected T variklis;

	public T getVariklis() {
		return variklis;
	}

}
