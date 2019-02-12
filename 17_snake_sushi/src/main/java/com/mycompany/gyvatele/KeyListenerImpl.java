package com.mycompany.gyvatele;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KeyListenerImpl implements KeyListener {

	@Autowired
	private GameState gState;

	@Autowired
	private GameCanvas gc;

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			synchronized ("a") {
				gState.moves = 0;
				gState.score = 0;
				gState.lengthofsnake = 3;
				gc.repaint();

			}
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			synchronized ("a") {
				gState.moves++;
				gState.right = true;
				gState.pauseRight = true;

				if (!gState.left) {
					gState.right = true;
					gState.pauseRight = true;

				} else {
					gState.right = false;
					gState.pauseRight = false;
					gState.left = true;
					gState.pauseLeft = true;
				}

				gState.up = false;
				gState.pauseUp = false;
				gState.down = false;
				gState.pauseDown = false;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			synchronized ("a") {
				gState.moves++;
				gState.left = true;
				gState.pauseLeft = true;

				if (!gState.right) {
					gState.left = true;
					gState.pauseLeft = true;
				} else {
					gState.left = false;
					gState.pauseLeft = false;
					gState.right = true;
					gState.pauseRight = true;
				}

				gState.up = false;
				gState.pauseUp = false;
				gState.down = false;
				gState.pauseDown = false;

			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			synchronized ("a") {
				gState.moves++;
				gState.up = true;
				gState.pauseUp = true;

				if (!gState.down) {
					gState.up = true;
					gState.pauseUp = true;
				} else {
					gState.up = false;
					gState.pauseUp = false;

					gState.down = true;
					gState.pauseDown = true;

				}

				gState.left = false;
				gState.pauseLeft = false;
				gState.right = false;
				gState.pauseRight = false;

			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			synchronized ("a") {
				gState.moves++;
				gState.down = true;
				gState.pauseDown = true;

				if (!gState.up) {
					gState.down = true;
					gState.pauseDown = true;
				} else {
					gState.down = false;
					gState.pauseDown = false;
					gState.up = true;
					gState.pauseUp = true;
				}

				gState.left = false;
				gState.pauseLeft = false;
				gState.right = false;
				gState.pauseRight = false;
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_P) {

			if (!gState.pause) {
				gState.pause = true;

			} else {

				gState.pause = false;

			}
		}
	}

}
