/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gyvatele;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author TAURAS
 */

@Configuration
@ComponentScan({ "com.mycompany.*" })
public class GameApp {

	@Bean
	public int gameSpeed() {
		return 100;
	}

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(GameApp.class);

		ctx.refresh();

		ctx.close();

	}
}
