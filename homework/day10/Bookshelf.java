package com.xebia.fs101.day10;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> books;
    private BookShelfType bookShelfType;
    
    Facebook facebook = new Facebook();

	public Bookshelf(){
       this(BookShelfType.Private);
    }

    public Bookshelf(BookShelfType bookShelfType){
        books = new ArrayList<>();
        this.bookShelfType=bookShelfType;
    }

    public int size() {
        return books.size();
    }

    public void add(Book book) {
        if(exists(book)){
            throw new BookShelfException("The book exists ");
        }
        books.add(book);
    }

   public boolean isPublic(){
        return bookShelfType==BookShelfType.Public;
   }

    public boolean exists(Book book) {
        return books.contains(book);
    }

    public void makePublic() {
        this.bookShelfType=BookShelfType.Public;
    }
    
    public void shareOnSocialPlatform(SocialPlatform socialplatform) throws IOException
    {
    	if(!isPublic())
    	{
    		throw new BookShelfShareException("BookShelf is Private !");
    	}
    	
    	
    }
    
    public SocialPlatform selectPlatform(SupportedSocialPlatforms supportedPlatform, String Url) throws IOException
    {
    	SocialPlatform socialPlatform = null;
    	Url = "bookshelf/prashantc595";
    	
    	if(!isPublic())
    	{
    		if (supportedPlatform==SupportedSocialPlatforms.FaceBook)
    		{
    			socialPlatform = new Facebook();
    			socialPlatform.share(Url);
    			
    		}
    		else if(supportedPlatform==SupportedSocialPlatforms.Twitter)
    		{
    			socialPlatform = new Twitter();
    			socialPlatform.share(Url);
    		}
    		else if(supportedPlatform==SupportedSocialPlatforms.LinkedIn)
    		{
    			socialPlatform = new LinkedIn();
    			socialPlatform.share(Url);
    		}
    		else
    		{
    			System.out.println("Invalid Platform!!");
    		}
    	}
		return socialPlatform;
    }
    
    
}
