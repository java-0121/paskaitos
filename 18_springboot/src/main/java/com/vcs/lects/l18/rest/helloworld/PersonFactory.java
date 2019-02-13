package com.vcs.lects.l18.rest.helloworld;

import org.springframework.stereotype.Component;

@Component
public class PersonFactory {

	public Person getInstance() {

		Person p = new Person();
		p.setAge(20);
		p.setName("Vardenis");

		return p;

	}

}
