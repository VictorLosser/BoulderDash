package states;

import java.awt.Graphics;

import entities.Player;
import game.Game;
import worlds.World;

public class GameState extends State {

	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100,100);
		world = new World("res/world/world1.txt");
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
