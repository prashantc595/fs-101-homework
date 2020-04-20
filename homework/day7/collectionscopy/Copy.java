package com.xebia.day7.collectionscopy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy {

	
public void copy(ArrayList<String> srclist, ArrayList<String> destlist)
{
		
			try {  
        
            List<String> srclst = new ArrayList<String>(3); 
            List<String> destlst = new ArrayList<String>(3); 
  
            Collections.copy(destlst, srclst);
			}catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			}
			catch(IndexOutOfBoundsException e1)
			{
				System.out.println(e1.getMessage());
			}
			
  
			
        }

}