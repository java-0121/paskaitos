package com.vcs.lects.l17.spring.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Lada implements Car {

	private static int ladaCounter = 0;

	private int counter = 0;

	public Lada() {
		counter = ++ladaCounter;
	}

	@Override
	public void uzvesti() {
		System.out.println("zigg zigg zigg ...  vvrummm!  " + counter);
	}

}
