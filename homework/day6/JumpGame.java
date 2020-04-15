package com.xebia.day6;


public class JumpGame {

	public static boolean empty_array = false;
	
	public boolean jumpGame(int[] array) {
	    if(array.length <= 1)
	        return true;
	 
	    int pos = array[0]; 
	 
	    for(int i=0; i<array.length; i++){
	        
	        if(pos <= i && array[i] == 0) 
	            return false;
	 
	          
	        if(i + array[i] > pos){
	            pos = i + array[i];
	        }
	 
	        
	        if(pos >= array.length-1) 
	            return true;
	    }
	 
	    return false;    
	}
	

}
