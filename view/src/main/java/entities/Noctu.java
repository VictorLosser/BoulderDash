package entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import graphics.Animation;
import graphics.Assets;
import view.Handler;

public class Noctu extends Creature{
private Animation noctuAni;
	
	public Noctu(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_WIDTH);


		
		 bounds.x = 0;
	        bounds.y = 0;
	        bounds.width = 63;
	        bounds.height = 63;
	        
	        
	        noctuAni = new Animation(300, Assets.noctu);
	}

	@Override
	public void tick() {
		noctuAni.tock();
		getInput();
		move();
		checkTouch();
	}
	
	private void checkTouch(){
    	Rectangle cb = getCollisionBounds(0,0);
    	Rectangle ar = new Rectangle();
    	Rectangle ar2 = new Rectangle();
    	Rectangle ar3 = new Rectangle();
    	Rectangle ar4 = new Rectangle();
    	int arSize = 16;
    	ar.width = arSize;
    	ar.height = arSize;
    	ar2.width = arSize;
    	ar2.height = arSize;
    	ar3.width = arSize;
    	ar3.height = arSize;
    	ar4.width = arSize;
    	ar4.height = arSize;
    	
    	
    	
    		ar.x = cb.x+ cb.width / 2 - arSize / 2;
    		ar.y = cb.y - arSize;
    	
        		ar2.x = cb.x + cb.width / 2 -arSize / 2;
        		ar2.y = cb.y + cb.height;
    	
            		ar3.x = cb.x - arSize;
            		ar3.y = cb.y+ cb.height / 2 -arSize /2;
        		
        
                		ar4.x = cb.x + cb.width;
                		ar4.y = cb.y + cb.height / 2 -arSize /2 ;
       
        
    	
    	
    	Player p = handler.getWorld().getEntityManager().getPlayer();
    	

		if(p.getCollisionBounds(0, 0).intersects(ar)){
			p.touch(1);
			return;
		}else if(p.getCollisionBounds(0, 0).intersects(ar2)){
				p.touch(1);
				return;
		}else if(p.getCollisionBounds(0, 0).intersects(ar3)){
					p.touch(1);
					return;
		}else if(p.getCollisionBounds(0, 0).intersects(ar4)){
						p.touch(1);
						return;
		}else{
        	return;
        }
	}

	@Override
	public void render(Graphics g) {
	      g.drawImage(getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()), width, height,null);
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	
	private void getInput(){
        xMove = 0;
        yMove = 0;
	}
	
	 public BufferedImage getCurrentFrame(){ //This method return the image corresponding to the movement
	    	
	    		return noctuAni.getCurrentFrame();
	    	
	    		
	    	
	    }
}
