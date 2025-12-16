package proxies;

import interfaces.ServiceInterface;
import models.User;
import models.Video;
import services.VideoService;

public class VirtualVideoProxy implements ServiceInterface {

	private Video video = null;
	private ServiceInterface videoService;
	
	public VirtualVideoProxy() {
		super();
		this.videoService = new VideoService();
	}

	@Override
	public Video getVideo(User user, String id) {
		if(video == null) this.video = this.videoService.getVideo(user, id);
			
		return video;
	}

}
