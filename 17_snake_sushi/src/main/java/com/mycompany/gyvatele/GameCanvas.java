package com.mycompany.gyvatele;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameCanvas extends JPanel {

	private static final long serialVersionUID = 1L;

	@Autowired
	private GameState gs;

	@Autowired
	private ImgLoader imgLoader;

	@Override
	public void paint(Graphics g) {

		if (gs.moves == 0) {

			gs.snakeXlenght[2] = 50;
			gs.snakeXlenght[1] = 75;
			gs.snakeXlenght[0] = 100;

			gs.snakeYlenght[2] = 100;
			gs.snakeYlenght[1] = 100;
			gs.snakeYlenght[0] = 100;

			gs.pauseRight = true;

			// gs.rightmouth = imgLoader.rightmouth;
			imgLoader.rightmouth.paintIcon(this, g, gs.snakeXlenght[0], gs.snakeYlenght[0]);
			repaint();

		}

		// nupiesti siena
		g.setColor(Color.BLACK);
		g.drawRect(24, 10, 852, 55);
		// nupiestas paveiksliukas title
		// gs.titleImage = new ImageIcon("img/snaketitle.jpg");
		imgLoader.titleImage.paintIcon(this, g, 25, 11);

		// gameplay paveiksliukas
		g.setColor(Color.WHITE);
		g.drawRect(24, 74, 851, 577);
		// backgroundas

		g.setColor(Color.BLACK);
		g.fillRect(25, 75, 850, 575);

		// taskai
		g.setColor(Color.BLACK);
		g.setFont(new Font("arial", Font.PLAIN, 14));
		g.drawString("Score: " + gs.score, 780, 30);

		g.setColor(Color.BLACK);
		g.setFont(new Font("arial", Font.PLAIN, 14));
		g.drawString("LENGHT: " + gs.lengthofsnake, 780, 50);

		// pause
		if (gs.pause) {

			gs.right = false;
			gs.left = false;
			gs.up = false;
			gs.down = false;
			g.setColor(Color.WHITE);
			g.setFont(new Font("arial", Font.PLAIN, 30));
			g.drawString("Pause", 340, 350);
			repaint();

		}

		if (gs.pause == false && (gs.moves != 0)) {
			gs.right = gs.pauseRight;
			gs.left = gs.pauseLeft;
			gs.up = gs.pauseUp;
			gs.down = gs.pauseDown;

		}
		if (gs.pauseRight) {

			imgLoader.rightmouth.paintIcon(this, g, gs.snakeXlenght[0], gs.snakeYlenght[0]);
			repaint();
		}
		if (gs.pauseLeft) {

			imgLoader.leftmouth.paintIcon(this, g, gs.snakeXlenght[0], gs.snakeYlenght[0]);
			repaint();
		}
		if (gs.pauseUp) {

			imgLoader.upmouth.paintIcon(this, g, gs.snakeXlenght[0], gs.snakeYlenght[0]);
			repaint();
		}
		if (gs.pauseDown) {

			imgLoader.downmouth.paintIcon(this, g, gs.snakeXlenght[0], gs.snakeYlenght[0]);
			repaint();
		}

		// gs.leftmouth = new ImageIcon("img/leftmouth.png");
		// gs.rightmouth = new ImageIcon("img/rightmouth.png");
		// gs.upmouth = new ImageIcon("img/upmouth.png");
		// gs.downmouth = new ImageIcon("img/downmouth.png");
		// gs.snakeImage = new ImageIcon("img/snakeimage.png");

		for (int a = 0; a < gs.lengthofsnake; a++) {
			if (a == 0 && gs.right) {

				imgLoader.rightmouth.paintIcon(this, g, gs.snakeXlenght[a], gs.snakeYlenght[a]);
			}
			if (a == 0 && gs.left) {

				imgLoader.leftmouth.paintIcon(this, g, gs.snakeXlenght[a], gs.snakeYlenght[a]);
			}
			if (a == 0 && gs.up) {

				imgLoader.upmouth.paintIcon(this, g, gs.snakeXlenght[a], gs.snakeYlenght[a]);
			}
			if (a == 0 && gs.down) {

				imgLoader.downmouth.paintIcon(this, g, gs.snakeXlenght[a], gs.snakeYlenght[a]);
			}

			if (a != 0) {

				imgLoader.snakeImage.paintIcon(this, g, gs.snakeXlenght[a], gs.snakeYlenght[a]);
			}

		}

		// imgLoader.foodImage = new ImageIcon("img/food.png");
		if (gs.foodXpos[gs.xpos] == gs.snakeXlenght[0] && gs.foodYpos[gs.ypos] == gs.snakeYlenght[0]) {
			gs.score += gs.lengthofsnake * 2;
			gs.lengthofsnake++;
			gs.xpos = gs.random.nextInt(34);
			gs.ypos = gs.random.nextInt(23);
		}
		imgLoader.foodImage.paintIcon(this, g, gs.foodXpos[gs.xpos], gs.foodYpos[gs.ypos]);

		for (int b = 1; b < gs.lengthofsnake; b++) {

			if (gs.snakeXlenght[b] == gs.snakeXlenght[0] && gs.snakeYlenght[b] == gs.snakeYlenght[0]) {

				gs.right = false;
				gs.left = false;
				gs.up = false;
				gs.down = false;
				gs.pause = false;

				g.setColor(Color.white);
				g.setFont(new Font("arial", Font.BOLD, 50));
				g.drawString("Game Over", 300, 300);

				g.setFont(new Font("arial", Font.BOLD, 20));
				g.drawString("(Press SPACE to restart)", 300, 340);

			}
		}

		g.dispose();

	}

}
