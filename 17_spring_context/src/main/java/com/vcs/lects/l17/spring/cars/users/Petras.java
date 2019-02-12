package com.vcs.lects.l17.spring.cars.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vcs.lects.l17.spring.cars.Car;
import com.vcs.lects.l17.spring.cars.CarsFactory;

@Component
public class Petras {

	// @Autowired
	// private CarsFactory factory;

	@Autowired
	@Qualifier("lada")
	private Car car;

	public Car getPetrasCar() {
		return car; // factory.getInstance();

	}

}
