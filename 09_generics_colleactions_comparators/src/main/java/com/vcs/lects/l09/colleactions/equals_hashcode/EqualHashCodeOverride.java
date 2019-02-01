package com.vcs.lects.l09.colleactions.equals_hashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualHashCodeOverride {

	public static final void main(String... strings) {

		EqualHashCodeOverride e = new EqualHashCodeOverride();
		e.equalsExample();

	}

	public void equalsExample() {

		Map<String, Person> vardai = new HashMap<>();

		Person p = null;

		p = new Person("Jonas", "Jonauskas");
		vardai.put(p.name, p);

		p = new Person("Petras", "Petrauskas");
		vardai.put(p.name, p);

		p = new Person("Alius", "Petrauskas");
		vardai.put(p.name, p);

		p = new Person("Petras", "Jonauskas");
		vardai.put(p.name, p);

		// Naujas objektas
		p = new Person("Petras", "Petrauskas");

		if (vardai.containsKey(p.name)) {
			// TRUE Petras Jonauskas
		}

		Map<Person, Integer> persons = new HashMap<>();

		p = new Person("Jonas", "Jonauskas");
		persons.put(p, 1);

		Person pp = new Person("Petras", "Petrauskas");
		persons.put(pp, 2);
		
		p = new Person("PETRAS", "Petrauskas");
		persons.put(p, 3);

		p = new Person("Alius", "Petrauskas");
		persons.put(p, 1);

		p = new Person("Petras", null);
		persons.put(p, 13);

		// Naujas objektas
		p = new Person("PETRAS", "petrauskas");

		// Be override'intu Equals ir HashCode jis visada bus FALSE
		//
		if (persons.containsKey(p)) {
			// FALSE
			// TRUE po override'o
			System.out.println("Petras yra !!! :)" + persons.get(p));
		} else {
			System.out.println("nerado Petro :(");
		}

		// Kai turim referenc'a i orginalu objekta - nepraktiska / nereali situacija
		if (persons.containsKey(pp)) {
			System.out.println("Petrai tu cia ir vel??");
		}

	}

	class Person {

		private String name;
		private String surname;

		public Person(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		/**
		 * <pre>
		 * 
		 * 1) Jeigu EQUALS yra TRUE, tada HASHCODE reiksme privalo sutapti.
		 * 2) Jei HASHCODE sutampa, tada EQUALS neprivalo grazinti to paties rezultato.
		 * 
		 * </pre>
		 */

		@Override
		public int hashCode() {
			return ((name == null ? "" : name.toLowerCase()) + (surname == null ? "" : surname.toLowerCase()))
					.hashCode();
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == null) {
				return false;
			}

			if (obj instanceof Person) {
				Person person = (Person) obj;
				boolean nameEq = (person.name == null ? "" : person.name.toLowerCase())
						.equals(name == null ? "" : name.toLowerCase());
				boolean surnameEq = (person.surname == null ? "" : person.surname.toLowerCase())
						.equals(surname == null ? "" : surname.toLowerCase());
				return nameEq && surnameEq;
			}

			return false;
		}

	}

}
