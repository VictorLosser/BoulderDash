package controller;

import controller.KeyOrdercraft;

public class UserOrder implements IUserOrder {

	private final KeyOrdercraft	order;

	public UserOrder(final KeyOrdercraft order) {
		this.order = order;
	}

	@Override
	public KeyOrdercraft getOrder() {
		return this.order;
	}
}
