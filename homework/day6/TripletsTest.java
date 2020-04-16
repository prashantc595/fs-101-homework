package com.xebia.day6;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TripletsTest {
	
	// Time Complexity : - O(n^3) + O(1)
	
	Triplets triplet = new Triplets();
	
	@Test
	public void return_empty_set() {
		int[] array = {};

		Set<List<Integer>> output_2 = triplet.result(array);

		assertThat(output_2).hasSize(1).containsExactlyElementsOf(output_2);
		
	}

	@Test
	public void non_duplicate_triplets() {
		int[] array = { -1, 0, 1, 2, -1, -4 };

		Set<List<Integer>> output_2 = triplet.result(array);

		assertThat(output_2).hasSize(2).containsExactlyElementsOf(output_2);
		
	}
	
	
}
