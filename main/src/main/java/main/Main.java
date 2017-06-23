package main;

import java.io.IOException;
import java.sql.SQLException;

import view.View;

public class Main {

    public static void main(final String[] args) throws IOException {
        
        
<<<<<<< HEAD
        final View view = new View("Title !", 1280, 980);
=======
        final View view = new View("Title !", 1280, 720);
>>>>>>> branch 'master' of https://github.com/VictorLosser/BoulderDash.git
        
        try {
			view.start();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //final Controller controller = new Controller(view, model);
        
		
		
        /*try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
    }

}
