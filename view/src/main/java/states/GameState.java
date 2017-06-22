package states;

import java.awt.Graphics;

import entities.Player;
import view.View;
import worlds.World;

public class GameState extends State {

	private Player player;
	private World world;
	

	
	public GameState(View view) {
		super(view);
		player = new Player(view, 100,100);
		world = new World("C:/Users/Windows/git/BoulderDash/view/res/world/world1.txt");
	}


	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
