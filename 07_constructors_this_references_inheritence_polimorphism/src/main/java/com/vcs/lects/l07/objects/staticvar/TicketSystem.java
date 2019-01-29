package com.vcs.lects.l07.objects.staticvar;

public class TicketSystem {

	private static int nb = 1;

	public int nextInQueue() {
		return nb++;
	}

}
