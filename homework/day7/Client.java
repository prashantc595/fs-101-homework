package com.xebia.day7;

public class Client {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		Pair p = new Pair("Prashant", 6287);
		System.out.println("E : "+p.getFirst());
		System.out.println("T : "+p.getSecond());
	}
}
