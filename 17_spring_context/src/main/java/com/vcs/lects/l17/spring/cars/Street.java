package com.vcs.lects.l17.spring.cars;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vcs.lects.l17.spring.cars.users.Jonas;
import com.vcs.lects.l17.spring.cars.users.Petras;

@Component
public class Street {

	@Autowired
	private Petras petras;

	@Autowired
	private Jonas jonas;

	@Autowired
	private Lada lada;

	@PostConstruct
	public void isaususRytui() {

		lada.uzvesti();

		System.out.println("iseina abu i gatve...");

		jonas.getJonasCar().uzvesti();

		petras.getPetrasCar().uzvesti();

		System.out.println("vaziuoja darban..." + (lada == jonas.getJonasCar()));
	}

}
