package mediator;

import models.User;

public interface Mediator {

	public void send(User sender, String message);
	
}
