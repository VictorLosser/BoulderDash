package states;

import java.awt.Graphics;
import java.sql.SQLException;

import javax.swing.JOptionPane;

<<<<<<< HEAD
import entities.Player;
import entities.motionless.Diamond;
import entities.motionless.Ground;
import mapdao.IState;
import mapdao.IWorld;
import mapdao.Map;
import mapdao.MapDAO;
=======
>>>>>>> branch 'master' of https://github.com/VictorLosser/BoulderDash.git
import view.Handler;
import worlds.World;

public class GameState extends State implements IWorld {

<<<<<<< HEAD
	
	
	private IWorld view;
	public IWorld getView() {
		return view;
	}

=======
>>>>>>> branch 'master' of https://github.com/VictorLosser/BoulderDash.git
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
<<<<<<< HEAD
		world = new World(handler, this.getMapById(1).toString());
=======
		world = new World(handler, "C:/Users/victo/git/Boulder_Dash/model/res/world/world1.txt");
>>>>>>> branch 'master' of https://github.com/VictorLosser/BoulderDash.git

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
