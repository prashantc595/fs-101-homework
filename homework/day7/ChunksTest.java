package com.xebia.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChunksTest {

	Chunks chunk = new Chunks();
	
	@Test
	public void return_empty_list_when_input_list_is_empty()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		ArrayList<Integer> output = Chunks.Chunks(list, 1);
		
		assertThat(output).isEmpty();
		
		
	}
	
	@Test
	public void return_list_when_input_element_is_1_and_size_is_1()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		ArrayList<Integer> output = Chunks.Chunks(list, 1);
		
		assertThat(output).hasSize(0).containsAll(list);
	}
	
	@Test
	public void return_list_when_input_element_is_1_and_size_is_2()
	{
		
			ArrayList<Integer> list = new ArrayList<Integer>(1);
			
			ArrayList<Integer> output = Chunks.Chunks(list, 2);
			
			assertThat(output).hasSize(0).containsAll(list);
		
	}
	
	
	
}
