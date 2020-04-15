package com.xebia.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triplets {

	

	
	public Set<List<Integer>> result(int[] nums){
		
		if(nums.length==0)
		{
			System.out.println("Empty Set");
		}
		
		List<List<Integer>> al = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		List<Integer> firstlist = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		List<Integer> thirdList = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		
		//Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<nums.length-2;i++) // -1,0,1,2
		{
			for(int j=i+1;j<nums.length-1;j++)    //0,1,2
			{
				for(int k=j+1;k<nums.length;k++)  //1,2,-1,-4
				{
					if(nums[i]+nums[j]+nums[k]==0)
					{
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);

					}
				}
			}
		}
		//System.out.println(list);
		
		firstlist=list.subList(0, list.size()/3);
		secondList=list.subList(list.size()/3, list.size()-firstlist.size());
		thirdList=list.subList(list.size()-secondList.size(),list.size());
		
		Collections.sort(firstlist);
		Collections.sort(secondList);
		Collections.sort(thirdList);
		
		set.add(firstlist);
		set.add(secondList);
		set.add(thirdList);
		//System.out.println("Output : "+set);
		return set;
		
	}

}
