package order.state;

import order.Order;

public abstract class OrderBaseState {
	
	private Order order;
	
	public OrderBaseState(Order order) {
		super();
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public abstract void onEnter();
	public abstract void execute();
	public abstract void onLeave();
}
