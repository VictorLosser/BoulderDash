package entities.motionless;

import java.awt.Graphics;

import graphics.Assets;
import tiles.Tile;
import view.Handler;

public class Diamond extends MotionlessEntity{

	public Diamond(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHIGHT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.diamond, (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()), width, height,null);
		
	}
	
	
	
	
	/*
	 
	 /** Contains the sprite */
	/*private static final Sprite sprite = new Sprite('X', SpritesPositions.DIAMOND.ordinal(), 1);
	private boolean falling;
	
	/**
	 * Instantiates a new Diamond Object
	 
	 */
	/*public Diamond() {
		super(sprite, model.Permeability.PENETRABLE);
		this.setFalling(false);
	}

	/**
	 * Returns if the object is falling
	 
	 */
	/*@Override
	public boolean isFalling() {
		return this.falling;
	}

	/**
	 * Changes the falling state of the object
	 
	 */
	/*@Override
	public void setFalling(boolean falling) {
		this.falling = falling;
	}

	/**
	 * Returns the position of the object
	 
	 */
	/*@Override
	public Point getPosition() {
		return new Point(this.getX(), this.getY());
	}
}
	 
	 */
	

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

}
