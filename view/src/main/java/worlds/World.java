package worlds;

import java.awt.Graphics;

import tiles.Tile;
import utils.Utils;
import view.View;

public class World {

	private View game;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	public World(View game, String path){
		loadWorld(path);
		this.game = game;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		for(int y=0; y< height; y++){
			for(int x = 0; x < width; x++){
				getTile(x,y).render(g, (int) (x * Tile.TILEWIDTH - game.getGameCamera().getxOffset()), (int) (y * Tile.TILEHIGHT - game.getGameCamera().getyOffset()));
			}
		}
	}
	
	public Tile getTile(int x, int y){
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.noneTile;
		return t;
	}
	
	private void loadWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y=0; y< height; y++){
			for(int x = 0; x < width; x++){
				tiles[x][y] = Utils.parseInt(tokens[(x+y*width) + 4]);
			}
		}
	}
	
}
