package view;
/**
 * <h1>The Classe View.</h1>
 * 
 * @author Florian PFEIFER florian.pfeifer@viacesi.fr
 * @version 1.0
 */

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.io.IOException;

import javax.swing.SwingUtilities;


import controller.IController;
import controller.IUserOrder;
import controller.KeyOrdercraft;
import display.Display;
import graphics.Assets;
import input.KeyManager;
import model.IModel;
import states.GameState;
import states.MenuState;
import states.State;
import graphics.GameCamera;

public class View implements IView, Runnable {
	
	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
	private State menuState;
	
	//Input
	private KeyManager keyManager;
	
	//Camera
	private GameCamera gameCamera;
	
	public View(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		
	}

	private void init() {

		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);

		Assets.init();
		
		gameCamera = new GameCamera(this, 0,0);
		
		gameState = new GameState(this);
		menuState = new MenuState(this);
		State.setState(gameState);
	}
	
	
	private void tick() {
		keyManager.tick();
		
		if(State.getState() != null)
			State.getState().tick();
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw Here !
		
		if(State.getState() != null)
			State.getState().render(g);
		
		
		//End Drawing !
		bs.show();
		g.dispose();
		
	}
	
	@Override
	public void run() {

		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println("Ticks and Frames " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
	}
	
	public KeyManager getKeyManager(){
		return keyManager;
	}
	
	public GameCamera getGameCamera(){
		return gameCamera;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public synchronized void start(){
		if(running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void printMessage(String string) {
		// TODO Auto-generated method stub
		
	}

	
   
    /*public View(final IModel model) throws HeadlessException, IOException {
    	
    	this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}
    
    
    


	static KeyOrdercraft keyCodeToControllerOrder(final int keyCode) {
		IUserOrder userOrder;
		switch (keyCode) {
			case KeyEvent.VK_UP:
				return KeyOrdercraft.MoveUp;
		case KeyEvent.VK_RIGHT:
				return KeyOrdercraft.MoveRight;
		case KeyEvent.VK_DOWN:
				return KeyOrdercraft.MoveDown;
		case KeyEvent.VK_LEFT:
				return KeyOrdercraft.MoveLeft;
		default:
				userOrder = null;
		}
		return null;
		
	}
	
	public void run() {
		this.viewFrame.setVisible(true);
		
	}





	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
		
	}





	@Override
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}*/
	

}
