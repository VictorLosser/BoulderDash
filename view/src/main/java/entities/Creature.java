package entities;

import tiles.Tile;
import view.Handler;

public abstract class Creature extends Entity{

	
	
	public static final float DEFAULT_SPEED = 8.0f;

	public static final int DEFAULT_CREATURE_WIDTH = 64, DEFAULT_CREATURE_HEIGHT = 64;
	
	
	protected float speed;
	protected float xMove, yMove;
	
	public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }

    public void move(){
    	if(!checkEntityCollision(xMove, 0f))
        moveX();
    	if(!checkEntityCollision(0f, yMove))
        moveY();
    }

    public void moveX(){ //Method to move on the x axis
        if(xMove > 0){//Moving right
            int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

            if(!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHIGHT)){
                x += xMove;
            }else{
            	x = tx * Tile.TILEWIDTH - bounds.x - bounds.width - 1;
            }
        }else if(xMove < 0){//Moving left
            int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

            if(!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHIGHT)){
                x += xMove;
            }else{
            	x = tx * Tile.TILEWIDTH + Tile.TILEWIDTH - bounds.x;
            }
        }
    }

    public void moveY(){ //Method to move on the y axis
        if(yMove < 0){//Up
            int ty = (int) (y + yMove + bounds.y) / Tile.TILEHIGHT;

            if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
                    !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
                y += yMove;
            }else{
            	y = ty * Tile.TILEHIGHT + Tile.TILEHIGHT - bounds.y ;
            }
        }else if(yMove > 0){//Down
            int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHIGHT;

            if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
                    !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
                y += yMove;
            }else{
            	y = ty * Tile.TILEHIGHT - bounds.y - bounds.height -1;
            }
        }
    }

    protected boolean collisionWithTile(int x, int y){ //This method verify if the entity is solid
        return handler.getWorld().getTile(x, y).isSolid();
    }
    
    protected boolean pickUpTile(int x, int y){
    	return handler.getWorld().getTile(x, y).isItem();
    }
    
    
    /*/GETTERS AND SETTERS/*/
	
	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}
	

}
