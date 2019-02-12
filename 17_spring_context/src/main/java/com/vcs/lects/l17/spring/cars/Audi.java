package com.vcs.lects.l17.spring.cars;

import org.springframework.stereotype.Component;

@Component("a3")
public class Audi implements Car {

	@Override
	public void uzvesti() {
		System.out.println("wvroooom!");

	}

}
