package com.vcs.lects.l17.spring.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarsFactory {

	@Autowired
	private Audi audi;

	@Autowired
	private Lada lada;

	public Car getInstance() {
		return audi;
	}

}
