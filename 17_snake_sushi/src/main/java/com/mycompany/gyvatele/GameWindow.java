package com.mycompany.gyvatele;

import java.awt.Color;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameWindow {

	@Autowired
	private GameCanvas gc;

	public void createWindow() {
		JFrame obj = new JFrame();

		obj.setBounds(10, 10, 905, 700);
		obj.setBackground(Color.BLACK);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setResizable(true);
		obj.add(gc);
		obj.setVisible(true);
	}

}
