package com.xebia.day3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChunksTest {

	Chunk chunk = new Chunk();

	@Test
	public void return_empty_array_when_input_array_isEmpty_with_size_zero() {

		int[] arr = {};

		int[][] output = chunk.chunks(arr, 1);

		assertThat(output).isEmpty();

	}

	// [1] ,1 -> [[1]]
	@Test
	public void return_array_when_input_element_is1_and_size_is_1() {
		int[] array = { 1 };

		int[][] output_2 = chunk.chunks(array, 1);

		assertThat(output_2).hasSize(1).contains(array);
	}

	// [1,2] ,1 --> [[1],[2]]

	@Test
	public void test() {
		int[] a = { 1, 2 };

		int[][] output_3 = chunk.chunks(a, 1);

		assertThat(output_3).hasSize(2).contains(new int[] { 1 }, new int[] { 2 });
	}

}
