package proxies;

import interfaces.ServiceInterface;
import models.User;
import models.Video;
import services.VideoService;

public class ProtectedVideoProxy implements ServiceInterface {

	private ServiceInterface videoService;
	
	public ProtectedVideoProxy() {
		this.videoService = new VideoService();
	}
	
	public boolean checkAccess(User user) {
		return user.getRole().equals("Admin");
	}
	
	@Override
	public Video getVideo(User user, String id) {
		Video video = null;;
		if(checkAccess(user)){
			System.out.println("Access granted for " + user.getName());
			video = videoService.getVideo(user, id);
		}
		else {
			System.out.println("Access denied for " + user.getName());
		}
		
		return video ;
	}

}
