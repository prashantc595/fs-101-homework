package com.xebia.fs101.day10;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public interface SocialPlatform {

	String share(String Url) throws IOException;
}

class Facebook implements  SocialPlatform {

	Bookshelf bookshelf = new Bookshelf();
	@Override
	public String share(String Url) throws IOException {
		String sharedUrl_fb = "https://www.facebook.com/sharer/sharer.php?u=" + Url;
		return sharedUrl_fb;
	}
	
	
	
}
