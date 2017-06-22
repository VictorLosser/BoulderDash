package entities.motionless;

import java.awt.Graphics;

import graphics.Assets;
import tiles.Tile;
import view.Handler;

public class Ground extends MotionlessEntity{

	public Ground(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y,  Tile.TILEWIDTH, Tile.TILEHIGHT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.ground, (int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()), width, height,null);
		
	}

}
