package main;



import java.io.IOException;

import controller.Controller;
import model.Model;
import view.View;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     */
    public static void main(final String[] args) throws IOException {
        
        final Model model = new Model();
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);
		controller.control();
		
		
        /*try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
    }

}
