package com.xebia.fs101.day10;

import java.io.IOException;

public class LinkedIn implements SocialPlatform {

	Bookshelf bookshelf = new Bookshelf();
	@Override
	public String share(String Url) throws IOException {
		String sharedUrl_fb = "https://www.linkedIn.com/sharer/sharer.php?u=" + Url;
		return sharedUrl_fb;
	}

}
