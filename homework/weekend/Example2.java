package com.xebia.weekend;

public class Example2 {

	public int[] result(int[] arr, int num) {
		// arr = new int[] {1,2,3};
		//
		// num=2;

		int[] result = new int[arr.length];

		for (int i = 0; i <= arr.length; i++) {
			try {
				result[i] = arr[arr.length - (i + 1 + num)];
				System.out.print(result[i] + " ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" ");
			}

			num = num + 1;

		}
		return result;
	}

}
