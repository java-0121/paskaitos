package com.vcs.lects.l17.spring.cars;

import org.springframework.stereotype.Component;

@Component("lada")
public class TurboLada extends Lada {

	@Override
	public void uzvesti() {
		System.out.println("brummm brumm");
	}
}
