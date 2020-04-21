package com.xebia.shop;

public class XebiaMerchandise {
	
	

	public static void main(String[] args) {
		
		ShoppingCart shopcart = new ShoppingCart();
		
		Item first_item = new Item("Java Deep Dive",ItemType.BOOK, 2799);
		Item second_item = new Item("Puma",ItemType.TSHIRT, 1999);
		Item third_item = new Item("Calender",ItemType.CALENDER, 450);
		Item fourth_item = new Item("Cross",ItemType.PEN, 1799);
		
		// adding items
		shopcart.addItems(first_item,2);
		shopcart.addItems(second_item,4);
		shopcart.addItems(third_item,1);
		shopcart.addItems(fourth_item,6);
		
		// removing items
		shopcart.removeItem(second_item);
		
		//viewing items list
		shopcart.viewItems();
		
		// viewing final item summary
		shopcart.summary();
		
	}

}
