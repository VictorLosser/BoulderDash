package view;


import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

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

public class ViewFrame extends JFrame  {
	
	/** The model. */
	private IModel						model;

	/** The controller. */
	private IController				controller;
	
	
	
	private static final long	serialVersionUID	= -697358409737458175L;
	
	public ViewFrame(final IModel model) throws HeadlessException, IOException{
		this.buildViewFrame(model);
	}
	
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) throws IOException {
		super(gc);
		this.buildViewFrame(model);
	}
	
	public ViewFrame(final IModel model, final String title) throws HeadlessException, IOException {
		super(title);
		this.buildViewFrame(model);
	}
	
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) throws IOException {
		super(title, gc);
		this.buildViewFrame(model);
	}
	
	private IController getController() {
		return this.controller;
	}

	
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	
	protected IModel getModel() {
		return this.model;
	}

	
	private void setModel(final IModel model) {
		this.model = model;
	}

		
	void buildViewFrame(final IModel model) throws IOException {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
	}

	/*@Override
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
		
	}*/

	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}