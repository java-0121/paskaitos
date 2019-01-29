package com.vcs.lects.l07.objects.staticvar;

public class BankQueue {

	public static void main(String[] args) {

		TicketMachine t1 = new TicketMachine();

		TicketMachine t2 = new TicketMachine();

		Ticket ticket1 = t1.printTicket();
		System.out.println(ticket1.getNumber());
		System.out.println(t1.printTicket().getNumber());
		System.out.println(t1.printTicket().getNumber());
		System.out.println(t1.printTicket().getNumber());

		System.out.println(t2.printTicket().getNumber());

		System.out.println(t1.printTicket().getNumber());

	}
}
