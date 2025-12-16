package interfaces;

import models.User;
import models.Video;

public interface ServiceInterface {
	
	Video getVideo(User user, String id);
	
}
