package view;


import javax.swing.SwingUtilities;


public class ViewFacade implements IView, Runnable {
	
	
	private final ViewFrame viewFrame;

	
   
    public ViewFacade() {
    	this.viewFrame = new ViewFrame();
		SwingUtilities.invokeLater(this);
	}
    
    
	
	public void run() {
		this.viewFrame.setVisible(true);
		
	}

}
