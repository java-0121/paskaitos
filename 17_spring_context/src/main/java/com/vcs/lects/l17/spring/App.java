package com.vcs.lects.l17.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(AppConfig.class);

		ctx.refresh();

//		Street street = ctx.getBean(Street.class);
//		street.isaususRytui();

		ctx.close();

	}

}
