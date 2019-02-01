package com.vcs.lects.l09.collections.comparators.bank;

import java.util.Comparator;

public class HumanFirstQueue implements Comparator<Ticket> {

	@Override
	public int compare(Ticket t1, Ticket t2) {

		// op
		if (t1.getOp().getPriority() != t2.getOp().getPriority()) {
			// Operacijos tikrai nevienodos
			return t1.getOp().getPriority() - t2.getOp().getPriority();
		}

		// nb
		return t1.getNumber() - t2.getNumber();
	}

}
