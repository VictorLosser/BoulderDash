package view;
/**
 * <h1>The Classe View.</h1>
 * 
 * @author Florian PFEIFER florian.pfeifer@viacesi.fr
 * @version 1.0
 */

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import controller.IController;
import controller.IUserOrder;
import controller.KeyOrdercraft;


public class View implements IView, Runnable {
	
	
	private final ViewFrame viewFrame;

	
   
    public View() {
    	
    	this.viewFrame = new ViewFrame();
		SwingUtilities.invokeLater(this);
	}
    
    
    


	static KeyOrdercraft keyCodeToControllerOrder(final int keyCode) {
		IUserOrder userOrder;
		switch (keyCode) {
			case KeyEvent.VK_UP:
				return KeyOrdercraft.MoveUp;
		case KeyEvent.VK_RIGHT:
				return KeyOrdercraft.MoveRight;
		case KeyEvent.VK_DOWN:
				return KeyOrdercraft.MoveDown;
		case KeyEvent.VK_LEFT:
				return KeyOrdercraft.MoveLeft;
		default:
				userOrder = null;
		}
		return null;
		
	}
	
	public void run() {
		this.viewFrame.setVisible(true);
		
	}

}
