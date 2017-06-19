package view;

import java.awt.event.KeyEvent;

import controller.IController;


public class EventPerformer {

	private final IController orderPerformer;

	public EventPerformer(final IController orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	private IController keyCodeToUserOrder(final int keyCode) {
		IController userOrder;
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
