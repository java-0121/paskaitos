package com.vcs.lects.l17.spring.cars.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vcs.lects.l17.spring.cars.Audi;
import com.vcs.lects.l17.spring.cars.Car;
import com.vcs.lects.l17.spring.cars.Lada;

@Component
public class Jonas {

	@Autowired
	private Lada lada;

	public Car getJonasCar() {
		return lada;
	}

}
