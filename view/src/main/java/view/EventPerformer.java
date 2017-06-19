package view;

import java.awt.event.KeyEvent;

import controller.IController;
import controller.IUserOrder;
import controller.KeyOrdercraft;

public class EventPerformer{

	


	private KeyOrdercraft EventPerformer(final int keyCode) {
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



	
}
