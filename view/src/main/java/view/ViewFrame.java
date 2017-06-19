package view;


import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 * The Class ViewFrame.
 *
 * @author PFEIFER Florian
 */

public class ViewFrame extends JFrame  {
	
	
	private static final long	serialVersionUID	= -697358409737458175L;
	
	public ViewFrame() throws HeadlessException{
		this.buildViewFrame();
	}
		
	void buildViewFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Boulder_Dash");
		this.setContentPane(new ViewPanel());
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
	}

	
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}