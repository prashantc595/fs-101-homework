package com.xebia.day7.collectionscopy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class CopyTest {
	
	Copy copy = new Copy();

	@Test
	public void return_final_list_when_source_list_and_destination_list_are_empty()
	{
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		copy.copy(list1, list2);
		
		assertThat("Result is also empty");
		
		
		
	}
	
	@Test
	public void return_final_list_when_source_list_and_destination_list_are_non_empty()
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("ABC");
		list1.add("DEF");
		list1.add("GHI");
		ArrayList<String> list2=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		
		copy.copy(list1, list2);
		
		assertThat("Lists copied !");
		
		
		
	}
	
}
