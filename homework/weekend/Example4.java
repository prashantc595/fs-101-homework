package com.xebia.weekend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {

	public String[] result(String[] str, int num) {

		// str = new String[]{ "a", "b", "c" };
		// num = 3;

		// System.out.println(StringUtils.);
		String[] output = new String[str.length];

		for (int i = 0; i < str.length; i++) {
			output[i] = str[i] + "," + str[i] + "," + str[i] + ",";
			System.out.print(output[i]);
		}
		return output;

	}

}
