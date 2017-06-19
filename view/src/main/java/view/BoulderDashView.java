package view;

import controller.IController;

public class BoulderDashView {

	private final EventPerformer	eventPerformer;


	public BoulderDashView(final IController orderPerformer) {
		this.eventPerformer = new EventPerformer(orderPerformer);
	}
	
	
}
