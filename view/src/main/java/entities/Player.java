package entities;

import java.awt.Graphics;

import game.Game;
import graphics.Assets;

public class Player extends Creature{

	private Game game;
	
	public Player(Game game, float x, float y) {
		super(x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_WIDTH);
		this.game = game;
	}

	@Override
	public void tick() {
		getInput();
		move();
	}

	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().up)
			yMove = -speed;
		if(game.getKeyManager().down)
			yMove = speed;
		if(game.getKeyManager().left)
			xMove = -speed;
		if(game.getKeyManager().right)
			xMove = speed;
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.staticPlayer, (int) x, (int) y, width, height, null);
	}

}
