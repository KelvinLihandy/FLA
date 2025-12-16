package main;

import interfaces.ServiceInterface;
import models.User;
import models.Video;
import proxies.CacheVideoProxy;
import proxies.ProtectedVideoProxy;
import proxies.VirtualVideoProxy;

public class Main {
	
	public Main() {
		ServiceInterface virtualProxy = new VirtualVideoProxy();
		Video video = virtualProxy.getVideo(null, "111");
		System.out.println("video " + video.getId());
		
		ServiceInterface cacheProxy = new CacheVideoProxy();
		Video video1 = cacheProxy.getVideo(null, "11");
		Video video2 = cacheProxy.getVideo(null, "11");
		
		ServiceInterface protectedProxy = new ProtectedVideoProxy();
		Video video3 = protectedProxy.getVideo(new User("asad", "Admin"), "11");
		Video video4 = protectedProxy.getVideo(new User("asasdfsd", "HRD"), "11");
	}
	
	public static void main(String args[]) {
		new Main();
	}
	
}
