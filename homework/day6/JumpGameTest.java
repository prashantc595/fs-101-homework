package com.xebia.day6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class JumpGameTest {

	JumpGame jump=new JumpGame();
	
	@Test
	public void return_empty_array_when_input_array_isEmpty_with_size_zero() {

		int[] arr = {};

		boolean output = jump.jumpGame(arr);

		assertThat("Empty Array");

	}
	
	@Test
	public void return_reachable_position() {
		int[] array = {2,3,1,1,4};

		boolean output = jump.jumpGame(array);

		assertThat(output).isIn(true);
		
		assertThat("Reachable index");
	}
	
	@Test
	public void return_unreachable_position() {
		int[] array = {3,2,1,0,4};

		boolean output = jump.jumpGame(array);

		assertThat(output).isIn(false);
		
		assertThat("UnReachable index");
	}
}
