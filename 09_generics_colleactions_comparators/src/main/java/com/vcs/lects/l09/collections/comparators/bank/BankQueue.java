package com.vcs.lects.l09.collections.comparators.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankQueue {

	public static void main(String[] args) {

		System.out.println("Galimos operacijos sitam banke:");
		for (Op op : Op.values()) {
			System.out.println(op);
		}

		System.out.println();

		List<Ticket> tickets = new ArrayList<>();

		tickets.add(new Ticket(false, Op.Grynieji));
		tickets.add(new Ticket(false, Op.Saskaita));
		tickets.add(new Ticket(false, Op.Sutartys));
		tickets.add(new Ticket(true, Op.Grynieji));
		tickets.add(new Ticket(false, Op.Saskaita));
		tickets.add(new Ticket(false, Op.Sutartys));
		tickets.add(new Ticket(true, Op.Sutartys));
		tickets.add(new Ticket(false, Op.Sutartys));
		tickets.add(new Ticket(false, Op.Saskaita));
		tickets.add(new Ticket(false, Op.Grynieji));
		tickets.add(new Ticket(true, Op.Sutartys));
		//tickets.add(new Ticket(false, Op.BankoApiplesimas));

		Collections.sort(tickets, new VipClientsQueue());

		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}

		System.out.println();

		Collections.sort(tickets, new HumanFirstQueue());

		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}

	}

}
