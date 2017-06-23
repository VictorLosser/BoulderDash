package states;

import java.awt.Graphics;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import entities.Player;
import entities.motionless.Diamond;
import entities.motionless.Ground;
import mapdao.IState;
import mapdao.IWorld;
import mapdao.Map;
import mapdao.MapDAO;
import view.Handler;
import worlds.World;

public class GameState extends State implements IWorld {

	
	
	private IWorld view;
	public IWorld getView() {
		return view;
	}

	private World world;
	
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
		world = new World(handler, this.getMapById(1).toString());

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
