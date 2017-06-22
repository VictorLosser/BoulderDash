package graphics;

import java.awt.image.BufferedImage;

public class Assets {//This class will load all images from the sprite and assign it to a variable

	public static final int width = 16, height = 16;
	
	//Here we create the different variable of the Rockford images on the sprite
	
	public static BufferedImage[] leftPlayer;
	public static BufferedImage[] rightPlayer;
	public static BufferedImage[] upPlayer;
	public static BufferedImage[] downPlayer;
	public static BufferedImage[] staticPlayer;
	//Here we create the different variable of the Enemies images on the sprite
	public static BufferedImage wall, boulder, ground, diamond, none;

	
	public static void init(){
		SpriteSheet sheetRockford = new SpriteSheet(ImageLoader.loadImage("/textures/Rockford.png"));
		SpriteSheet sheetEnemies = new SpriteSheet(ImageLoader.loadImage("/textures/Enemies.png"));
		leftPlayer = new BufferedImage[2];
		rightPlayer= new BufferedImage[2];
		upPlayer= new BufferedImage[2];
		downPlayer= new BufferedImage[2];
		staticPlayer= new BufferedImage[2];
		
		//This code will assign to a variable the location of a Rockford image on the sprite
		leftPlayer[0] = sheetRockford.crop(0, height, width, height);
		leftPlayer[1] = sheetRockford.crop(width, height, width, height);
		rightPlayer[0] = sheetRockford.crop(0, height*3, width, height);
		rightPlayer[1] = sheetRockford.crop(width, height*3, width, height);
		upPlayer[0] = sheetRockford.crop(0, height*2, width, height);
		upPlayer[1] = sheetRockford.crop(width, height*2, width, height);
		downPlayer[0] = sheetRockford.crop(0, height*4, width, height);
		downPlayer[1] = sheetRockford.crop(width, height*4, width, height);
		staticPlayer[0] = sheetRockford.crop(0, 0, width, height);
		staticPlayer[1] = sheetRockford.crop(width, 0, width, height);
		
		//This code will assign to a variable the location of an Enemies image on the sprite
		wall = sheetEnemies.crop(0, 0, width, height);
		ground = sheetEnemies.crop(width, 0, width, height);
		none = sheetEnemies.crop(width*2, 0, width, height);
		boulder = sheetEnemies.crop(width*3, 0, width, height);
		diamond = sheetEnemies.crop(width*4, 0, width, height);
	}

}
