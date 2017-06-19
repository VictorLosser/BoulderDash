package view;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.IController;
import model.IModel;



/**
 * The Class ViewFrame.
 *
 * @author PFEIFER Florian  florian.pfeifer@viacesi.fr
 * @version 1.0
 */

public class ViewFrame extends JFrame implements KeyListener {
	
	/** The model. */
	private IModel						model;

	/** The controller. */
	private IController				controller;
	
	
	
	private static final long	serialVersionUID	= -697358409737458175L;
	
	public ViewFrame() throws HeadlessException{
		this.buildViewFrame();
	}
	
	private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

		
	void buildViewFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Boulder_Dash");
		this.setContentPane(new ViewPanel());
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}	
}