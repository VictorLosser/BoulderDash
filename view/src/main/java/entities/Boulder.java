package entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import graphics.Assets;
import view.Handler;

public class Boulder extends Creature{

	public Boulder(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_WIDTH);


		 bounds.x = 0;
	        bounds.y = 0;
	        bounds.width = 63;
	        bounds.height = 63;
	}

	@Override
	public void tick() {
		getInput();
	
		move();
		checkTouch();
	}
	
	private void checkTouch(){
    	Rectangle cb = getCollisionBounds(0,0);
    	Rectangle ar = new Rectangle();
    	int arSize = 32;
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
			
		}
    	
	

	
		@Override
	    public void render(Graphics g) {
	        g.drawImage(Assets.boulder, (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()), width, height,null);
		
	}
	
	

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	
	private void getInput(){
        xMove = 0;
        yMove = speed*2;
	}
}
