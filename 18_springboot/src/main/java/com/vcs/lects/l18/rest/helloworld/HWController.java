package com.vcs.lects.l18.rest.helloworld;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {

	private final static Logger LOG = LoggerFactory.getLogger(HWController.class);

	@Autowired
	private PersonFactory pf;

	@Autowired
	private HttpServletRequest request;

	@Value("${appversion:nenustatyta versija}")
	private String ver;

	@Value("${serverip:127.0.0.1}")
	private String serverIp;

	@GetMapping
	public String sayHello() {
		LOG.info("Caling HW...");
		return "hello :) " + ver + " " + serverIp;
	}

	@GetMapping("/headers")
	public List<String> showHeaders() {
		Enumeration<String> names = request.getHeaderNames();

		List<String> headers = new ArrayList<>();

		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String content = request.getHeader(name);

			headers.add(name + " : " + content);
		}

		return headers;
	}

	@GetMapping("/html")
	public String sayHello2() {
		LOG.info("Caling HW...");
		return "<html><title>hello :)</title><body><h1>Labas</h1>" + request.getRemoteAddr() + "</body></html>";
	}

	@GetMapping(path = "/person")
	public Person givePerson() {

		LOG.info("Giving person...");

		Person p = pf.getInstance();

		LOG.info("Giving person... done {} ", p);
		return p;
	}

	@PostMapping(path = "/grow")
	public Person takePerson(@RequestBody Person p) {

		LOG.info("Get growing...");

		p.setAge(p.getAge() + 10);

		LOG.info("Get growing... done {} ", p);
		return p;
	}

}
