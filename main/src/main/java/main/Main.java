package main;



import java.io.IOException;

import controller.Controller;
import model.Model;
import view.View;


public class Main {


    public static void main(final String[] args) throws IOException {
        
        final Model model = new Model();
        final View view = new View("Title !", 1280, 720);
        view.start();
        
        //final Controller controller = new Controller(view, model);
        
		
		
        /*try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
    }

}
