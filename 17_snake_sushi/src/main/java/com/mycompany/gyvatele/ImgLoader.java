package com.mycompany.gyvatele;

import javax.annotation.PostConstruct;
import javax.swing.ImageIcon;

import org.springframework.stereotype.Component;

@Component
public class ImgLoader {

	ImageIcon titleImage;
	ImageIcon rightmouth;
	ImageIcon upmouth;
	ImageIcon downmouth;
	ImageIcon leftmouth;
	ImageIcon snakeImage;
	ImageIcon foodImage;

	@PostConstruct
	public void load() {
		foodImage = new ImageIcon("img/food.png");
		titleImage = new ImageIcon("img/snaketitle.jpg");
		leftmouth = new ImageIcon("img/leftmouth.png");
		rightmouth = new ImageIcon("img/rightmouth.png");
		upmouth = new ImageIcon("img/upmouth.png");
		downmouth = new ImageIcon("img/downmouth.png");
		snakeImage = new ImageIcon("img/snakeimage.png");

	}

}
