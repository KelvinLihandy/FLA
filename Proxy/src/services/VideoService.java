package services;

import interfaces.ServiceInterface;
import models.User;
import models.Video;

public class VideoService implements ServiceInterface{

	@Override
	public Video getVideo(User user, String id) {
		System.out.println("video " + id);
		Video video = new Video(id, "ini rek", 100);
		
		return video;
	}
	
}
