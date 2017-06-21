package model;

import java.awt.image.BufferedImage;

public class Assets {//This class will load all images from the sprite and assign it to a variable

	public static final int width = 16, height = 16;
	
	public static BufferedImage leftPlayer, rightPlayer, upPlayer, downPlayer, staticPlayer;
	public static BufferedImage leftPlayer1, rightPlayer1, upPlayer1, downPlayer1, staticPlayer1;

	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Rockford.png"));
	}

}
