package com.mycompany.gyvatele;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActionListnerImpl implements ActionListener {

	@Autowired
	private GameState gState;

	@Autowired
	private GameCanvas gc;

	@Override
	public void actionPerformed(ActionEvent e) {
		gState.timer.start();
		if (gState.right) {
			for (int r = gState.lengthofsnake - 1; r >= 0; r--) {

				gState.snakeYlenght[r + 1] = gState.snakeYlenght[r];
			}

			for (int r = gState.lengthofsnake; r >= 0; r--) {
				if (r == 0) {

					gState.snakeXlenght[r] = gState.snakeXlenght[r] + 25;
				} else {
					gState.snakeXlenght[r] = gState.snakeXlenght[r - 1];
				}
				if (gState.snakeXlenght[r] > 850) {
					gState.snakeXlenght[r] = 25;
				}
			}
			gc.repaint();

		}
		if (gState.left) {
			for (int r = gState.lengthofsnake - 1; r >= 0; r--) {

				gState.snakeYlenght[r + 1] = gState.snakeYlenght[r];
			}

			for (int r = gState.lengthofsnake; r >= 0; r--) {
				if (r == 0) {

					gState.snakeXlenght[r] = gState.snakeXlenght[r] - 25;
				} else {
					gState.snakeXlenght[r] = gState.snakeXlenght[r - 1];
				}
				if (gState.snakeXlenght[r] < 25) {
					gState.snakeXlenght[r] = 850;
				}
			}
			gc.repaint();

		}
		if (gState.up) {
			for (int r = gState.lengthofsnake - 1; r >= 0; r--) {

				gState.snakeXlenght[r + 1] = gState.snakeXlenght[r];
			}

			for (int r = gState.lengthofsnake; r >= 0; r--) {
				if (r == 0) {

					gState.snakeYlenght[r] = gState.snakeYlenght[r] - 25;
				} else {
					gState.snakeYlenght[r] = gState.snakeYlenght[r - 1];
				}
				if (gState.snakeYlenght[r] < 75) {
					gState.snakeYlenght[r] = 625;
				}
			}
			gc.repaint();
		}
		if (gState.down) {
			for (int r = gState.lengthofsnake - 1; r >= 0; r--) {

				gState.snakeXlenght[r + 1] = gState.snakeXlenght[r];
			}

			for (int r = gState.lengthofsnake; r >= 0; r--) {
				if (r == 0) {

					gState.snakeYlenght[r] = gState.snakeYlenght[r] + 25;
				} else {
					gState.snakeYlenght[r] = gState.snakeYlenght[r - 1];
				}
				if (gState.snakeYlenght[r] > 625) {
					gState.snakeYlenght[r] = 75;
				}
			}
			gc.repaint();
		}
	}
}
