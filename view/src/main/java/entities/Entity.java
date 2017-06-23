package entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import view.Handler;

public abstract class Entity {
	public static final int DEFAULT_HEALTH = 10;
    protected Handler handler;
    protected float x,y;	//Position
    protected int width, height;	//Size
    protected Rectangle bounds;
    protected boolean active = true;
    protected int health;
    public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Entity(Handler handler, float x, float y, int width, int height){
        this.handler = handler;
        this.x = x;		//Position in x
        this.y = y;		//Position in y
        this.width = width;		//Size in width
        this.height = height;	//Size in height
        health = DEFAULT_HEALTH;
        bounds = new Rectangle(0,0,width,height);
    }

    public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public abstract void tick();

    public abstract void render(Graphics g); //This method will draw the image of the entity
    
    public abstract void die();
    
    public void touch(int amt){
    	health -= amt;
    	if(health <= 0){
    	
    	active = false;	
    	die();
    }
    }

    public boolean checkEntityCollision(float xOffset, float yOffset){
    	for(Entity e : handler.getWorld().getEntityManager().getEntities()){
    		if(e.equals(this))
    			continue;
    		if(e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
    			return true;
    		}
    		return false;
    	}
    
    
    public Rectangle getCollisionBounds(float xOffset, float yOffset){
    	return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
    }
    
    /*/GETTERS AND SETTERS/*/
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}