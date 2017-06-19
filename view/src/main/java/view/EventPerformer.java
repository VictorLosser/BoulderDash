package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;


public class EventPerformer {

	private final IOrderPerformer orderPerformer;

	public EventPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
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
