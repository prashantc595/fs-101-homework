package com.xebia.day24.task1;

public class Lambda {

	private LambdaInterf add = (String name, int number) -> {
		int sum = 0;
		if (name.equals(null)) {
			throw new NullPointerException("String name cannot be null");
		} else {
			for (int i = 0; i < name.length(); i++) {
				char character = name.charAt(i);
				int ascii = character;
				sum = sum + ascii;
			}
			int result = sum + number;
			return result;
		}
	};

	public LambdaInterf getAdd() {
		return add;
	}

	public void setAdd(LambdaInterf add) {
		this.add = add;
	}

}
