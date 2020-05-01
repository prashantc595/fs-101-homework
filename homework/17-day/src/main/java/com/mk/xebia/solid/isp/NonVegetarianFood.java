package com.mk.xebia.solid.isp;

public interface NonVegetarianFood extends Food {

	boolean containsSeafood();

	boolean containsMeat();

	boolean containsBeaf();
	
	boolean isNonVeg();
	
	boolean isHalal();
}
