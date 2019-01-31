package com.vcs.lects.l09.colleactions.comparators;

import java.util.Comparator;

public class PriimamojoEile implements Comparator<Person> {

	private int order;
	
	public PriimamojoEile(boolean order) {
		this.order = (order ? 1 : -1);
	}
	
	
	@Override
	public int compare(Person o1, Person o2) {
		// -1... keliam i eiles virsu
		// 0 - nekeiciam
		// 1 ... esamas Person eina zemyn pagal sarasa

		// Tik pagal amziu
		// return otherPerson.age - this.age;

		// Tik pagal varda
		// return this.surname.compareToIgnoreCase(otherPerson.surname) ;

		if (o2.getAge() < o1.getAge()) {
			return -1 * order;
		} else if (o2.getAge() > o1.getAge()) {
			return 1 * order;
		}

		return order * o1.getSurname().compareToIgnoreCase(o2.getSurname());
	}

}
