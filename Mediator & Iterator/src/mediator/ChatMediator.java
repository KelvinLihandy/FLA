package mediator;

import java.util.ArrayList;

import models.Admin;
import models.Member;
import models.User;

public class ChatMediator implements Mediator {

	private ArrayList<User> users;
	
	public ChatMediator() {
		this.users = new ArrayList<User>();
	}
	
	public void addUser(User newUser) {
		users.add(newUser);
	}

	@Override
	public void send(User sender, String message) {
		if(sender instanceof Admin) {
			for (User user : users) {
				if(!user.getName().equals(sender.getName())) {
					user.receive(message);
				}
			}
		}
		else if(sender instanceof Member) {
			for (User user : users) {
				if(user instanceof Member && !user.getName().equals(sender.getName())) {
					user.receive(message);
				}
			}
		}
		else {
			System.out.println("Guest noob no send send");
		}
	}

}
