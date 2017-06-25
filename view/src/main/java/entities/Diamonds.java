package entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import graphics.Assets;
import view.Handler;

public class Diamonds extends Creature{

	//private Score score;
	//private Font font;
	
	public Diamonds(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_WIDTH);
		
		//score = new Score();
		//font = new Font("Arial", Font.BOLD, 25);
		 bounds.x = 0;
	        bounds.y = 0;
	        bounds.width = 63;
	        bounds.height = 63;
	}

	@Override
	public void tick() {
		getInput();
		if(!checkItemCollision(0f, yMove))
			if(!checkItemCollision(xMove, 0f))
		move();
		
		checkTouch();
	}
	
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
    	
	@Override
	public void render(Graphics g) {
		render(g, (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()));
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(Assets.diamond, x, y, width,height, null);
		//g.setFont(font);
		//g.drawString("Diamonds "+this.score.getNumber_diamond()+ "/" + this.score.getTotal_number_diamond(), 1000, 25);
	}
		
	public void die() {	
		System.out.println("MONEY MONEY MONEY MONEY MONEY");
	}
	
	private void getInput(){	
		xMove = 0;
        yMove = speed*2;
    }    	
}