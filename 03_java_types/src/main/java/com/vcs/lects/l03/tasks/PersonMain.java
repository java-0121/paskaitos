package com.vcs.lects.l03.tasks;

import com.vcs.lects.l03.person.Person;

public class PersonMain {

	public static void main(String[] args) {

		PersonNameInitials i = new PersonNameInitials();

		Person p = new Person();
		p.setPavarde("ąardauskas");
		p.setVardas("pAVARDAUSKAS");

		String rez = i.makeInitials(p);
		
//		
//		if (i == 8567) {
//			System.out.println();
//		}

	}

}
