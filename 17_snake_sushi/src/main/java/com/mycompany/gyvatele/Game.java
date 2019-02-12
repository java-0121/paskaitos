/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gyvatele;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.annotation.PostConstruct;
import javax.swing.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Game {

	@Autowired
	private GameState gState;

	@Autowired
	private GameCanvas gc;

	@Autowired
	private ActionListener actionListener;

	@Autowired
	private KeyListener keyListener;

	@Autowired
	private GameWindow gWindow;

	@Autowired
	private int gameSpeed;

	@PostConstruct
	public void init() {
		init(gameSpeed);
	}

	public void init(int delay) {

		gc.addKeyListener(keyListener);
		gc.setFocusable(true);
		gc.setFocusTraversalKeysEnabled(false);

		gWindow.createWindow();

		gState.timer = new Timer(delay, actionListener);

		gState.timer.start();
	}

}
