package com.vcs.lects.l18.rests.library.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alive")
public class Alive {

	private final static Logger LOG = LoggerFactory.getLogger(Alive.class);

	@Value("${version:unknown}")
	private String version;

	@GetMapping
	public String touch() {
		LOG.info("Alive endpoint...");
		return "I'm alive - " + version;
	}

}
