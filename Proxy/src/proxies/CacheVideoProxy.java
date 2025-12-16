package proxies;

import java.util.HashMap;

import interfaces.ServiceInterface;
import models.User;
import models.Video;
import services.VideoService;

public class CacheVideoProxy implements ServiceInterface {

	private HashMap<String, Video> cache = new HashMap<>();
	private ServiceInterface videoService;
	
	public CacheVideoProxy() {
		this.videoService = new VideoService();
	}
	
	@Override
	public Video getVideo(User user, String id) {
		Video video = cache.get(id);
		if(video == null) {
			System.out.println("Caching");
			video = this.videoService.getVideo(user, id);
			cache.put(id, video);
		}
		else {
			System.out.println("Retrieve cache");
		}
		
		return video;
	}
	
	public void reset() {
		this.cache.clear();
	}

}
