package entities.motionless;

import java.awt.Color;
import java.awt.Graphics;

import graphics.Assets;
import tiles.Tile;
import view.Handler;

/*---THIS CLASS DEFINE THE OBJECT GROUND WHICH IS A FULL BLOCK OF SOIL---*/
public class Ground extends MotionlessEntity{//The ground don't move so it extends MotionlessEntity

	public Ground(Handler handler, float x, float y) {
		super(handler, x, y,  Tile.TILEWIDTH, Tile.TILEHIGHT);
		
		bounds.x = 0;
        bounds.y = 0;
        bounds.width = 64;
        bounds.height = 64;
	}
	
	

	@Override
	public void tick() {
		
	}
	@Override	
	public void die(){
    	
    }

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.ground, (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()), width, height,null);
		/*g.setColor(Color.red);
        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
                (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
                bounds.width, bounds.height);*/
	}

}
