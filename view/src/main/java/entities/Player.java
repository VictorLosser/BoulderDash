package entities;

import java.awt.Graphics;
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
    }

    private void getInput(){
        xMove = 0;
        yMove = 0;

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

        /*g.setColor(Color.red);
        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
                (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
                bounds.width, bounds.height);*/
    }
    
    private BufferedImage getCurrentFrame(){
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