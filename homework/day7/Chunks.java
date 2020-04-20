package com.xebia.day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Chunks {

	public static ArrayList<Integer> empty_list=new ArrayList<>();
	
	static ArrayList<Integer> result_list = new ArrayList<>();
	
	public static ArrayList<Integer> Chunks(ArrayList<? extends Number> input, int chunkSize)
	{
		if (input.size()==0)
		return empty_list;
		else
		{
			
			for(int i=0;i<result_list.size();i++)
			{
				input.add(result_list.get(i),null);
				
			}
			
		}
		return result_list;
		
	}
		
			
}
