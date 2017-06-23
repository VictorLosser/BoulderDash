package entities.motionless;

import java.awt.Graphics;

import graphics.Assets;
import tiles.Tile;
import view.Handler;

/*---THIS CLASS DEFINE THE OBJECT GROUND WHICH IS A FULL BLOCK OF SOIL---*/
public class Ground extends MotionlessEntity{//The ground don't move so it extends MotionlessEntity

	public Ground(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y,  Tile.TILEWIDTH, Tile.TILEHIGHT);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.ground, (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()), width, height,null);
		
	}

}
