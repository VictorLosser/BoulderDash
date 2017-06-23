package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import graphics.Animation;
import graphics.Assets;
import view.Handler;

public class Player extends Creature{
	
	private Animation down,up,left,right,staticP;
	

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_WIDTH);

        //These variables will size the rectangle that will be in collision with an object
        //If we don't define these variables, it will be full size by default
        bounds.x = 7;
        bounds.y = 15;
        bounds.width = 48;
        bounds.height = 50;
        
        //Here we attribute the image corresponding to the movement variable
        down = new Animation(300, Assets.downPlayer);
        up = new Animation(300, Assets.upPlayer);
        left = new Animation(300, Assets.leftPlayer);
        right = new Animation(300, Assets.rightPlayer);
        staticP = new Animation(300, Assets.staticPlayer);
    }

    @Override
    public void tick() {
    	down.tock();
    	up.tock();
    	left.tock();
    	right.tock();
    	staticP.tock();
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
        checkTouch();
    }

    private void checkTouch(){
    	Rectangle cb = getCollisionBounds(0,0);
    	Rectangle ar = new Rectangle();
    	int arSize = 32;
    	ar.width = arSize;
    	ar.height = arSize;
    	
    	
    	if(handler.getKeyManager().up){
    		ar.x = cb.x+ cb.width / 2 - arSize / 2;
    		ar.y = cb.y - arSize;
    	}else if(handler.getKeyManager().down){
        		ar.x = cb.x + cb.width / 2 -arSize / 2;
        		ar.y = cb.y + cb.height;
    	}else if(handler.getKeyManager().left){
            		ar.x = cb.x - arSize;
            		ar.y = cb.y+ cb.height / 2 -arSize /2;
        		
        }else if(handler.getKeyManager().right){
                		ar.x = cb.x + cb.width;
                		ar.y = cb.y + cb.height / 2 -arSize /2 ;
            		
        }else{
        	return;
        }
    	
    		for(Entity e : handler.getWorld().getEntityManager().getEntities()){
    			if(e.equals(this))
    				continue;
    			if(e.getCollisionBounds(0, 0).intersects(ar)){
    				e.touch(1);
    				return;
    			}
    		}
    	}
    
    
    @Override
    public void die(){
    	System.out.println("You Died");
    }
    private void getInput(){
        xMove = 0;
        yMove = 0;

        //Here we apply the movement corresponding to the keyboard input
        if(handler.getKeyManager().up)
            yMove = -speed;
        if(handler.getKeyManager().down)
            yMove = speed;
        if(handler.getKeyManager().left)
            xMove = -speed;
        if(handler.getKeyManager().right)
            xMove = speed;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);

        /*g.setColor(Color.green);
        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
                (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
                bounds.width, bounds.height);*/
    }
    
    private BufferedImage getCurrentFrame(){ //This method return the image corresponding to the movement
    	if(xMove < 0){
    		return left.getCurrentFrame();
    		
    	}else if(xMove > 0){
    		return right.getCurrentFrame();
    		
    	}else if(yMove < 0){
    		return up.getCurrentFrame();
    		
    	}else if(yMove > 0){
    		return down.getCurrentFrame();
    	}else{
    		return staticP.getCurrentFrame();
    	}
    	
    }

}