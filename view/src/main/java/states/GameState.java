package states;

import java.awt.Graphics;

import view.Handler;
import worlds.World;

public class GameState extends State {

	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "C:/Users/victo/git/Boulder_Dash/model/res/world/world1.txt");

		handler.setWorld(world);
		
	}

	@Override
	public void tick() {
		world.tick();
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		
	}

}
