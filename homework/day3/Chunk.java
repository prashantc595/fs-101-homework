package com.xebia.day3;

import java.util.HashSet;
import java.util.Set;

public class Chunk {

	public static int[][] empty_array = {};

	public static int[][] chunks(int[] input, int chunkSize) {
		if (input.length == 0) {
			return empty_array;
		}

		int result_size_array=input.length/chunkSize;
		int[][] result_array = new int[result_size_array] [];
		//result_array[0] = new int[] { 1 };
		for (int i=0;i<result_size_array;i++)
			result_array[i] = new int[] {input[i]};
		return result_array;
		
	}

}