package worlds;

import java.awt.Graphics;

import entities.Boulder;
import entities.Boupi;
import entities.Butterfly;
import entities.EntityManager;
import entities.Noctu;
import entities.Octopus;
import entities.Player;

import entities.motionless.Ground;



import tiles.Tile;
import utils.Utils;
import view.Handler;

public class World  {

    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;
    
    private EntityManager entityManager;

    public World(Handler handler, String message){
        this.handler = handler;
        entityManager = new EntityManager(handler, new Player(handler, 5555, 100));
       // entityManager = new EntityManager(handler, new Boulder(handler, 100, 100));
        //entityManager.addEntity(new Ground(handler, 200, 200));
        //entityManager.addCreature( new Octopus(handler,200,200));
        loadWorld(message);
        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);
    }

    public void tick(){
    	entityManager.tick();
    }

    public void render(Graphics g){
        int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
        int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
        int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHIGHT);
        int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHIGHT + 1);

        for(int y = yStart;y < yEnd;y++){
            for(int x = xStart;x < xEnd;x++){
                getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
                        (int) (y * Tile.TILEHIGHT - handler.getGameCamera().getyOffset()));
            }
        }
        entityManager.render(g);
    }

    public EntityManager getEntityManager() {
		return entityManager;
	}

	public Tile getTile(int x, int y){
        if(x < 0 || y < 0 || x >= width || y >= height)
            return Tile.noneTile;

        Tile t = Tile.tiles[tiles[x][y]];
        if(t == null)
            return Tile.noneTile;
        return t;
    }

    private void loadWorld(String message){
        String file = message;
        String[] tokens = file.split("\\s+");
        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new int[width][height];
        for(int y=0; y< height; y++){
            for(int x = 0; x < width; x++){
                tiles[x][y] = Utils.parseInt(tokens[(x+y*width) + 4]);
                if (tiles[x][y] == 0) { entityManager.addEntity(new Ground(handler, x * Tile.TILEWIDTH, y * Tile.TILEHIGHT)); }
               if (tiles[x][y] == 3) {entityManager.addRock( new Boulder(handler, x * Tile.TILEWIDTH, y * Tile.TILEHIGHT)); }
               if (tiles[x][y] == 5) {entityManager.addCreature( new Octopus(handler, x * Tile.TILEWIDTH, y * Tile.TILEHIGHT)); }
               if (tiles[x][y] == 6) {entityManager.addCreature( new Butterfly(handler, x * Tile.TILEWIDTH, y * Tile.TILEHIGHT)); }
               if (tiles[x][y] == 10) {entityManager.addCreature( new Noctu(handler, x * Tile.TILEWIDTH, y * Tile.TILEHIGHT)); }
               if (tiles[x][y] == 11) {entityManager.addCreature( new Boupi(handler, x * Tile.TILEWIDTH, y * Tile.TILEHIGHT)); }
            }
        }
    }
    
    public int getHeight(){
    	return height;
    }
    
    public int getWidth(){
    	return width;
    }

	
	
	

}