package entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import graphics.Assets;
import view.Handler;

public class Diamonds extends Creature{

	
	
	public Diamonds(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_WIDTH);
		
		//Generates the bounds of the sprite
		 bounds.x = 0;
	        bounds.y = 0;
	        bounds.width = 63;
	        bounds.height = 63;
	}
	//Ticks the different methods of this class
	@Override
	public void tick() {
		getInput();
		if(!checkItemCollision(0f, yMove))
			if(!checkItemCollision(xMove, 0f))
		move();
		
		checkTouch();
	}
	//Checks if the sprite is touching another destructible sprite
	private void checkTouch(){
    	Rectangle cb = getCollisionBounds(0,0);
    	Rectangle ar = new Rectangle();
    	int arSize = 8;
    	ar.width = arSize;
    	ar.height = arSize;
    	
    	if( this.yMove != 0){
    		ar.x = cb.x + cb.width / 2 -arSize / 2;
    		ar.y = cb.y + cb.height;
	}else{
    	return;
    }
    	
    Player p = handler.getWorld().getEntityManager().getPlayer();

			if(p.getCollisionBounds(0, 0).intersects(ar)){
				p.touch(1);
				return;
			}
				for(Entity c : handler.getWorld().getEntityManager().getCreature()){
					if(c.equals(this))
						continue;
					
					if(c.getCollisionBounds(0, 0).intersects(ar)){
						c.touch(1);
						return;
					}
				}
				
			
	if(p.getCollisionBounds(0, 0).intersects(ar)){
		p.touch(1);
		return;
	}
	
	for(Entity c : handler.getWorld().getEntityManager().getCreature()){
		if(c.equals(this))
			continue;		
		if(c.getCollisionBounds(0, 0).intersects(ar)){
			c.touch(1);
			return;
		}
	}		
	}
	//Renders the sprite on the map	
	@Override
	public void render(Graphics g) {
		render(g, (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()));
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(Assets.diamond, x, y, width,height, null);
		
	}
	//Makes print out "MONEY MONEY MONEY MONEY MONEY" when the diamond is picked up
	
	public void die() {	
		System.out.println("MONEY MONEY MONEY MONEY MONEY");
	}
	//Gets the Input for the move method
	private void getInput(){	
		xMove = 0;
        yMove = speed*2;
    }    	
}