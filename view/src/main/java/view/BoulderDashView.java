package view;

import controller.IOrderPerformer;

public class BoulderDashView {

	private final EventPerformer	eventPerformer;


	public BoulderDashView(final IOrderPerformer orderPerformer) {
		this.eventPerformer = new EventPerformer(orderPerformer);
	}
	
	
}
