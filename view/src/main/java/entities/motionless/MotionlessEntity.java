package entities.motionless;

import entities.Entity;
import view.Handler;

public abstract class MotionlessEntity extends Entity {

	public MotionlessEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
}
