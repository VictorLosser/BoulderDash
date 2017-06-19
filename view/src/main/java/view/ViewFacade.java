package view;


import javax.swing.SwingUtilities;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, Runnable {
	
	/** The frame. */
	private final ViewFrame viewFrame;

	
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
    	this.viewFrame = new ViewFrame();
		SwingUtilities.invokeLater(this);
	}
    
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    
    public final void displayMessage(final String message) {
       
        this.viewFrame.displayMessage(message);
    }
	
	public void run() {
		this.viewFrame.setVisible(true);
		
	}

}
