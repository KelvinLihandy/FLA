package proxies;

import facades.HomeSystemFacade;

public class ProtectionProxy implements IProtectionProxy {
	
	private boolean isAuth = false;
	private HomeSystemFacade facade = new HomeSystemFacade();
	
	public ProtectionProxy(String username, String pass) {
		super();
		if(username.equals("admin") && pass.equals("admin")) isAuth = true;
		else isAuth = false;
	}

	@Override
	public boolean login() throws Exception {
		if(isAuth) {
			System.out.println("Logged in");
			return isAuth;
		}
		else {
			throw new Exception("Wrong crendentials");
		}
	}

	@Override
	public void arrive() throws Exception {
		if(isAuth) facade.arrive();
		else {
			throw new Exception("Not authorized");
		}
	}
	
	@Override
	public void leave() throws Exception {
		if(isAuth) facade.leave();
		else {
			throw new Exception("Not authorized");
		}
	}

}
