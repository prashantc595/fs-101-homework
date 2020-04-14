package com.xebia.day4;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		ImmutableClass immutable = new ImmutableClass(2020,7,20,new Date());
		
		System.out.println(immutable.getAddYears());
		System.out.println(immutable.getAddMonths());
		System.out.println(immutable.getAddDays());
		System.out.println(immutable.getImmutableDate());
		
	}

}
