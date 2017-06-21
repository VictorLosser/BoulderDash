package controller;
/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Florian PFEIFER florian.pfeifer@viacesi.fr
 * @version 1.0
 */

import controller.IController;
import model.IModel;
import view.IView;
import controller.KeyOrdercraft;


public class Controller implements IController {

    
    private final IView  view;

   
    private final IModel model;

    
    public Controller(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

   

    public IView getView() {
        return this.view;
    }
  
    public IModel getModel() {
        return this.model;
    }



	public void orderPerform(KeyOrdercraft keyOrdercraft) {
		switch (keyOrdercraft) {
		case MoveLeft:
			this.model.moveHero(-1, 0);
			this.model.putInTabani(16, 16, 0, 16);
			break;
		case MoveRight:
			this.model.moveHero(1 ,0);
			this.model.putInTabani(16, 48, 0, 48);
			break;
		case MoveUp:
			this.model.moveHero(0 , -1);
			this.model.putInTabani(16, 16, 0, 16);
			break;
		case MoveDown:
			this.model.moveHero(0 , 1);
			this.model.putInTabani(0, 0, 16, 0);
			break;
		
		default:
			
			break;
		}
		
	}



	public void control() {
		this.view.printMessage("YO :) ");
		
	}

}
    
   

