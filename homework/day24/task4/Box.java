package com.xebia.day24.task4;

public class Box {

	int length;
	int width;
	int height;

	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int volume() {
		return length * width * height;
	}

}
