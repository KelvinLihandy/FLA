package proxies;

public interface IProtectionProxy {

	public boolean login() throws Exception;
	public void arrive() throws Exception;
	public void leave() throws Exception;
	
}
