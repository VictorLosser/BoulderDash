package graphics;

import entities.Entity;
import tiles.Tile;
import view.Handler;


public class GameCamera {

	private Handler handler;
	private float xOffset, yOffset;
	
	public GameCamera(Handler handler, float xOffset, float yOffset){
		this.handler = handler;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	
	public void checkMapBorder(){
		if(xOffset < 0){
			xOffset = 0;
		}else if(xOffset > handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth())
			xOffset = handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth();
		if(yOffset < 0){
			yOffset = 0;
		}else if(yOffset > handler.getWorld().getHeight() *Tile.TILEHIGHT - handler.getHeight())
			yOffset = handler.getWorld().getHeight() *Tile.TILEHIGHT - handler.getHeight();
	}
	
	public void centerOnEntity(Entity e){
		xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() / 2;
		yOffset = e.getY() - handler.getHeight() / 2 + e.getHeight() / 2;
		checkMapBorder();
	}
	
	public void move(float xAmount, float yAmount){
		xOffset += xAmount;
		yOffset += yAmount;
		checkMapBorder();
		
	}

	
	/*/GETTERS AND SETTERS/*/
	
	public float getxOffset() {
		return xOffset;
	}

	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}

	public float getyOffset() {
		return yOffset;
	}

	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}
	
	
}
