package com.vcs.lects.l17.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.vcs.lects.l17.spring.*"})
public class AppConfig {
	
	
	@Bean
	public String version() {
		return "v1.8";
	}
	
	

}
