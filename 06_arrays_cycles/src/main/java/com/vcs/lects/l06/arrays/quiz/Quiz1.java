package com.vcs.lects.l06.arrays.quiz;

public class Quiz1 {
	
	
	public static final void main(String[] args) {
		
		Quiz1 q = new Quiz1();
		
		Person[] sarasiux = new Person[84];
		sarasiux[83] = new Person();
		sarasiux[83].setName("Kazys");
		
		Person last = q.findLast(new Person[0]);
		System.out.println(last);
		
		//q.printPersons(sarasiux);
		
	}

	public Person findLast(Person[] persons) {
		
		if (persons != null && persons.length > 0) {
			return persons[persons.length - 1];
		}
		
		return null;
	}

	public void printPersons(Person[] persons) {
		System.out.println(persons);
	}

}
