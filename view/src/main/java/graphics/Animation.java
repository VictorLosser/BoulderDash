package graphics;

import java.awt.image.BufferedImage;

public class Animation {

	public int index,speed;
	public long lastTime, timer;
	public BufferedImage[] frames;
	
	//Constructor of the class Animation
	
	public Animation(int speed, BufferedImage[] frames){
		this.speed = speed;
		this.frames =frames;
		index = 0;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	//The tick method of the class (tick tock)
	public void tock(){
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed){
			index++;
			timer = 0;
			if(index >= frames.length)
				index =0;
		}
				
	}
	
	/*/GETTERS/*/
	public BufferedImage getCurrentFrame(){
		return frames[index];
	}
}
