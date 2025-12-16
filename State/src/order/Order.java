package order;

import order.state.OrderBaseState;
import order.state.OrderDeliveringState;
import order.state.OrderWaitingState;

public class Order {
	
	private String food;
	private String receiver;
	private OrderBaseState currentState;
	public final OrderWaitingState waitingState = new OrderWaitingState(this);
	public final OrderDeliveringState deliveringState = new OrderDeliveringState(this);
	

	public Order(String food, String receiver) {
		super();
		this.food = food;
		this.receiver = receiver;
		this.currentState = this.waitingState;
	}
	
	public void changeState(OrderBaseState state) {
		currentState.onLeave();
		currentState = state;
		currentState.onEnter();
	}
	
	public void doOrder() {
		this.changeState(this.deliveringState);
		int seconds = 0;
		while(seconds < 5) {
			this.currentState.execute();
			seconds+=1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	

}
