package graphics;

import java.awt.image.BufferedImage;

/*---THIS CLASS WILL LOAD ALL IMAGES FROM THE SPRITE AND ASSIGN IT TO A VARIABLE---*/
public class Assets {

	public static final int width = 16, height = 16;
	
	//Here we create the different variable of the Rockford images on the sprite
	
	public static BufferedImage[] leftPlayer, rightPlayer, upPlayer, downPlayer, staticPlayer;
	public static BufferedImage[] octopus, butterfly, pingou, noctu, boupi;
	
	//Here we create the different variable of the Enemies images on the sprite
	public static BufferedImage wall, boulder, ground, diamond, none;

	//Initializes the different sprites for the game
	public static void init(){
		SpriteSheet sheetRockford = new SpriteSheet(ImageLoader.loadImage("/textures/Rockford.png"));
		SpriteSheet sheetEnemies = new SpriteSheet(ImageLoader.loadImage("/textures/Enemies.png"));
		leftPlayer = new BufferedImage[2];
		rightPlayer= new BufferedImage[2];
		upPlayer= new BufferedImage[2];
		downPlayer= new BufferedImage[2];
		staticPlayer= new BufferedImage[2];
		octopus = new BufferedImage[4];
		butterfly= new BufferedImage[4];
		pingou= new BufferedImage[4];
		noctu= new BufferedImage[4];
		boupi= new BufferedImage[4];
		
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
		
		octopus[0] = sheetEnemies.crop(width*10, height*12, width, height);
		octopus[1] = sheetEnemies.crop(width*10, height*13, width, height);
		octopus[2] = sheetEnemies.crop(width*10, height*14, width, height);
		octopus[3] = sheetEnemies.crop(width*10, height*15, width, height);
		
		butterfly[0] = sheetEnemies.crop(width*10, 0, width, height);
		butterfly[1] = sheetEnemies.crop(width*10, height*1, width, height);
		butterfly[2] = sheetEnemies.crop(width*10, height*2, width, height);
		butterfly[3] = sheetEnemies.crop(width*10, height*3, width, height);
		
		pingou[0] = sheetEnemies.crop(width*9, height*4, width, height);
		pingou[1] = sheetEnemies.crop(width*9, height*5, width, height);
		pingou[2] = sheetEnemies.crop(width*9, height*6, width, height);
		pingou[3] = sheetEnemies.crop(width*9, height*7, width, height);
		
		noctu[0] = sheetEnemies.crop(width*9, height*8, width, height);	
		noctu[1] = sheetEnemies.crop(width*9, height*9, width, height);
		noctu[2] = sheetEnemies.crop(width*9, height*10, width, height);
		noctu[3] = sheetEnemies.crop(width*9, height*11, width, height);
		
		boupi[0] = sheetEnemies.crop(width*9, height*16, width, height);
		boupi[1] = sheetEnemies.crop(width*9, height*17, width, height);
		boupi[2] = sheetEnemies.crop(width*9, height*18, width, height);
		boupi[3] = sheetEnemies.crop(width*9, height*19, width, height);
	}

}
