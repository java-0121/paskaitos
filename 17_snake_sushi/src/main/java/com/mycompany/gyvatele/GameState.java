package com.mycompany.gyvatele;

import java.util.Random;

import javax.swing.Timer;

import org.springframework.stereotype.Component;

@Component
public class GameState {

	int[] snakeXlenght = new int[750];
	int[] snakeYlenght = new int[750];

	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	boolean pause = false;
	// pause
	boolean pauseLeft = false;
	boolean pauseRight = false;
	boolean pauseUp = false;
	boolean pauseDown = false;

	int lengthofsnake = 3;
	int score = 0;

	int[] foodXpos = { 25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500,
			525, 550, 575, 600, 625, 650, 675, 700, 725, 750, 775, 800, 825, 850 };
	int[] foodYpos = { 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500, 525,
			550, 575, 600, 625 };

	Random random = new Random();

	int xpos = random.nextInt(34);
	int ypos = random.nextInt(23);

	int moves = 0;

	Timer timer = null;

}
