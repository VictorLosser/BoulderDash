package view;

import java.awt.image.BufferedImage;

public class Assets {//This class will load all images from the sprite and assign it to a variable

	public static final int width = 16, height = 16;
	
	//Here we create the different variable of the Rockford images on the sprite
	public static BufferedImage leftPlayer, rightPlayer, upPlayer, downPlayer, staticPlayer;
	public static BufferedImage leftPlayer1, rightPlayer1, upPlayer1, downPlayer1, staticPlayer1;
	
	//Here we create the different variable of the Enemies images on the sprite
	public static BufferedImage wall, boulder, ground, dash, none;

	
	public static void init(){
		SpriteSheet sheetRockford = new SpriteSheet(ImageLoader.loadImage("/textures/Rockford.png"));
		SpriteSheet sheetEnemies = new SpriteSheet(ImageLoader.loadImage("/textures/Enemies.png"));

		
		//This code will assign to a variable the location of a Rockford image on the sprite
		leftPlayer = sheetRockford.crop(0, height, width, height);
		leftPlayer1 = sheetRockford.crop(width, height, width, height);
		rightPlayer = sheetRockford.crop(0, height*3, width, height);
		rightPlayer1 = sheetRockford.crop(width, height*3, width, height);
		upPlayer = sheetRockford.crop(0, height*2, width, height);
		upPlayer1 = sheetRockford.crop(width, height*2, width, height);
		downPlayer = sheetRockford.crop(0, height*4, width, height);
		downPlayer1 = sheetRockford.crop(width, height*4, width, height);
		staticPlayer = sheetRockford.crop(0, 0, width, height);
		staticPlayer1 = sheetRockford.crop(width, 0, width, height);
		
		//This code will assign to a variable the location of an Enemies image on the sprite
		wall = sheetEnemies.crop(0, 0, width, height);
		ground = sheetEnemies.crop(width, 0, width, height);
		none = sheetEnemies.crop(width*2, 0, width, height);
		boulder = sheetEnemies.crop(width*3, 0, width, height);
		dash = sheetEnemies.crop(width*4, 0, width, height);
	}

}
