package com.vcs.lects.l03.tasks;

import com.vcs.lects.l03.person.Person;

public class PersonNameInitials {

	public String makeInitials(Person person) {

		String vardas = person.getVardas();
		String pavarde = person.getPavarde();

		char pavardePirma = pavarde.toUpperCase().charAt(0);
		vardas = vardas.substring(0, 1).toUpperCase() + vardas.substring(1).toLowerCase();

		return vardas + " " + pavardePirma + ".";
	}

}
