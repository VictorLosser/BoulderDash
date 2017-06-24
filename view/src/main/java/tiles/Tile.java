package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	//public static Tile groundTile = new GroundTile(0);
	public static Tile noneTile = new NoneTile(4);
	public static Tile wallTile = new WallTile(1);
	//public static Tile boulderTile = new BoulderTile(3);
	//public static Tile diamondTile = new DiamondTile(7);
	
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public boolean isItem(){
		return false;
		
	}
	
	public int getId(){
		return id;
	}
	
	
	//Detection if there is a contact between player and object
	
	
	//if(this.player)
	
	
	
}
