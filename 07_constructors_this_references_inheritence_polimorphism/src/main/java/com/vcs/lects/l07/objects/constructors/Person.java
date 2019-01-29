package com.vcs.lects.l07.objects.constructors;

public class Person {

	private String name = "";
	private String surname;
	private boolean[] dantys = new boolean[0];
	private String[] citizens;
	
	
	// Anoniminis statinis blokas
	static {
//		Person p = new Person();
//		p.name = "";
	}

	// Anoniminis blokas
	{
		name = "";
	}

	// Konstruktorius
	public Person(String str,  int sk, String ... citizens) {

		this.citizens = citizens;
		
		// Pradiniu reiksmiu 
		dantys = new boolean[36];

		init();
	}

	public void init() {
		this.name = "Petras";
		this.surname = "Petrauskas";
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

}
