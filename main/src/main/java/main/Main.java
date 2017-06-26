package main;

import java.io.IOException;
import java.sql.SQLException;

import view.View;

public class Main {

    public static void main(final String[] args) throws IOException {
        
        
    	//main
       

        final View view = new View("Boulder Dash", 980, 760);

        
        try {
			view.start();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //final Controller controller = new Controller(view, model);
        
    }

}
