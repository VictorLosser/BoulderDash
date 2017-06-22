package entities;

import java.awt.Graphics;

import view.View;
import graphics.Assets;

public class Player extends Creature{

	public Player(View view, float x, float y) {
		super(view, x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_WIDTH);
	}

	@Override
	public void tick() {
		getInput();
		move();
		view.getGameCamera().centerOnEntity(this);

	}

	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(view.getKeyManager().up)
			yMove = -speed;
		if(view.getKeyManager().down)
			yMove = speed;
		if(view.getKeyManager().left)
			xMove = -speed;
		if(view.getKeyManager().right)
			xMove = speed;
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.staticPlayer, (int) (x - view.getGameCamera().getxOffset()), (int) (y - view.getGameCamera().getyOffset()), width, height, null);
	}

}
