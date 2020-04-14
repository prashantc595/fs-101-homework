package com.xebia.weekend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example5 {

	public List<String> result(String[] str) {

		// String[] str = new String[] {"a","a","a", "b","a","c","c","c"};
		List al = new ArrayList(Arrays.asList(str));

		int i = 0;

		while (i < al.size() - 1) {
			if (al.get(i) == al.get(i + 1)) {
				al.remove(i);
			} else {
				i++;
			}

		}
		// System.out.println(al);
		return al;

	}

}
