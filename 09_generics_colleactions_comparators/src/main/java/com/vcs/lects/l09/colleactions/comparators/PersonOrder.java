package com.vcs.lects.l09.colleactions.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonOrder {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(22, "Siaudvytis"));
		persons.add(new Person(31, "Petrauskas"));
		persons.add(new Person(99, "Jonautis"));
		persons.add(new Person(40, "Žvinys"));
		persons.add(new Person(40, "žilinskiene"));
		persons.add(new Person(41, "Žukauskas"));
		persons.add(new Person(30, "Pirdunas"));
		persons.add(new Person(30, "Pavardauskas"));

		System.out.println(Arrays.toString(persons.toArray()));

		// Tik su Comparable
//		Collections.sort(persons);
		
		// Ir su Compator
		Collections.sort(persons, new PriimamojoEile(true));
		
		System.out.println(Arrays.toString(persons.toArray()));
		
		Collections.sort(persons, new PriimamojoEile(false));

		System.out.println(Arrays.toString(persons.toArray()));

	}

}

class Person //implements Comparable<Person> {
{
	private int age;
	private String surname;

	Person(int age, String surname) {
		this.age = age;
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "" + age + " " + surname;
	}

	

}