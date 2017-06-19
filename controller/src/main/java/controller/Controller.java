package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
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


	@Override
	public void orderPerform(IUserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}
    
   
}
