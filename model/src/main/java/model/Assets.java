package model;

import java.awt.image.BufferedImage;

public class Assets {//This class will load all images from the sprite and assign it to a variable

	public static final int width = 16, height = 16;
	
	//Here we create the different variable of the images on the sprite
	public static BufferedImage leftPlayer, rightPlayer, upPlayer, downPlayer, staticPlayer;
	public static BufferedImage leftPlayer1, rightPlayer1, upPlayer1, downPlayer1, staticPlayer1;

	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Rockford.png"));
		
		//This code will assign to a variable the location of an image on the sprite
		leftPlayer = sheet.crop(0, height, width, height);
		leftPlayer1 = sheet.crop(width, height, width, height);
		rightPlayer = sheet.crop(0, height*3, width, height);
		rightPlayer1 = sheet.crop(width, height*3, width, height);
		upPlayer = sheet.crop(0, height*2, width, height);
		upPlayer1 = sheet.crop(width, height*2, width, height);
		downPlayer = sheet.crop(0, height*4, width, height);
		downPlayer1 = sheet.crop(width, height*4, width, height);
		staticPlayer = sheet.crop(0, 0, width, height);
		staticPlayer1 = sheet.crop(width, 0, width, height);
	}

}
