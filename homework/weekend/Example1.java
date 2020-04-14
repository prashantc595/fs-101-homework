package com.xebia.weekend;

public class Example1 {

	static void result(int start, int end) {

		for (int i = 0; i < end; i++) {

			if (i % 7 == 0 && i % 5 != 0)
				System.out.print(i + "  ");
		}
	}

	public static void main(String[] args) {
		result(1, 40);
	}

}
