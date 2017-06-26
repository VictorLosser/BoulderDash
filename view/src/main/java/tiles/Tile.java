package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	
	public static Tile noneTile = new NoneTile(4);
	public static Tile wallTile = new WallTile(1);
	
	
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	//Constructor of the class
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	/*/GETTERS AND SETTERS/*/
	
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
	
	
	
}
