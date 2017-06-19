package view;

import java.awt.event.KeyEvent;

import controller.IController;
import controller.IUserOrder;


public class EventPerformer implements IEventPerformer{

	private final IController orderPerformer;

	public EventPerformer(final IController orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	@Override
	public void eventPerform(final KeyEvent keyCode) {
		final IUserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
		if (userOrder != null) {
			this.orderPerformer.orderPerform(userOrder);
		}
	}
	
	private IUserOrder keyCodeToUserOrder(final int keyCode) {
		IUserOrder userOrder;
		switch (keyCode) {
			case KeyEvent.VK_UP:
				userOrder = new UserOrder(/*Order.UP*/);
				break;
			case KeyEvent.VK_RIGHT:
				userOrder = new UserOrder(/*Order.RIGHT*/);
				break;
			case KeyEvent.VK_DOWN:
				userOrder = new UserOrder(/*Order.DOWN*/);
				break;
			case KeyEvent.VK_LEFT:
				userOrder = new UserOrder(/*Order.LEFT*/);
				break;

			default:
				userOrder = null;
		}
		return userOrder;
	}
}
