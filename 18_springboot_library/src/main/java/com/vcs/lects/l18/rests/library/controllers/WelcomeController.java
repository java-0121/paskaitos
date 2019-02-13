package com.vcs.lects.l18.rests.library.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

	@Autowired
	private HttpServletRequest request;

	@GetMapping
	public String alive() {
		return "<html><body><a href='http://" + request.getLocalName() + ":" + request.getLocalPort()
				+ "/swagger-ui.html'>Swagger UI</a></body></html>";
	}

}
