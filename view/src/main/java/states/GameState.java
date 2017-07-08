package states;

import java.awt.Graphics;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import mapdao.IWorld;
import mapdao.Map;
import mapdao.MapDAO;

import view.Handler;
import worlds.World;

/*---THIS CLASS DEFINE THE STATE OF THE GAME AND IT EXECUTE THE TICK AND THE RENDER---*/
public class GameState extends State implements IWorld {

	private World world;
	
	private IWorld view;
	public IWorld getView() {
		return view;
	}

	@Override
	public Map getMapById(int id) throws SQLException {
		return MapDAO.getMapById(id);
	}  
	
	@Override
	public void displayMap(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	
	public GameState(Handler handler) throws SQLException {
		super(handler);

		/* /!\BY CHANGING THE NUMBER BELOW, YOU CHOOSE THE MAP YOU WANT/!\ */
		world = new World(handler, this.getMapById(4).toString());

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
