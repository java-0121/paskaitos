package com.vcs.lects.l07.objects.staticvar;

public class TicketMachine {

	private TicketSystem system = new TicketSystem();
	
	
	public Ticket printTicket() {
		
		return new Ticket(system.nextInQueue());
		
	}
	
	
}
