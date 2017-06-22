package states;

import java.awt.Graphics;

import view.View;;

public abstract class State {

	private static State currentState = null;
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	protected View view;
	
	public State(View view){
		this.view = view;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
