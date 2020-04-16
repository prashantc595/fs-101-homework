package com.xebia.day4;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME) 
@interface Annotation {

public String collection();
     
}


@Annotation(collection = "users")
public class User {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	        throws ClassNotFoundException 
	    { 
	  
	        // returns the Class object for this class 
	        @SuppressWarnings("rawtypes")
			Class myClass = User.class; 
	  
	        System.out.println("Class represented by myClass: "
	                           + myClass.toString()); 
	  
	        // Get the annotation 
	        // using getAnnotation() method 
	        System.out.println( 
	            "Annotation of myClass: "
	            + myClass.getAnnotation( 
	                  Annotation.class)); 
	    } 
}
