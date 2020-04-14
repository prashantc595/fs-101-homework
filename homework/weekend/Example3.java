package com.xebia.weekend;

import java.util.Arrays;

public class Example3 {

	public void result(String str) {

		// str = "prashant";

		char sortedArray[] = str.toUpperCase().toCharArray();

		Arrays.sort(sortedArray);

		System.out.println("Sorted Sequence : ..........");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " , ");
		}

	}

}
