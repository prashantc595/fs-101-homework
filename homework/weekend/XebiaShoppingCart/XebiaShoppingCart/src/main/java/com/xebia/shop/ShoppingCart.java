package com.xebia.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

	List<Item> items = new ArrayList<>();

	// Add new item to the cart
	public void addItems(Item item, int quantity) {
		item.setQuantity(quantity);
		items.add(item);
	}

	public void removeItem(Item item) {
		if (items.contains(item)) {
			items.remove(item);
		} else {
			System.out.println("Sorry ! No Item found...");
		}
	}

	// View total number of items in the cart

	public int totalNumberOfItemsInCart() {

		int noOfItems = 0;

		for (Item item : items) {
			noOfItems = noOfItems + item.getQuantity();
		}
		return noOfItems;
	}

	// View Items of the Cart

	public List<Item> viewItems() {
		return items;
	}

	// view totalPrice of the cart

	public double totalCartPrice() {
		double n = 0;
		for (Item item_cart : items) {
			n = n + (item_cart.getPrice() * item_cart.getQuantity());
		}
		return n;
	}
	
	public double summary()
	{
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("|      Item     |    Item Type    |     Price        |         Total       |");
		System.out.println("------------------------------------------------------------------------------");
		double total =0;
		for(Item item : items)
		{
			System.out.println("| "+item.getItemName()+"   |        "+item.getItemType()+"     |       "+item.getQuantity()+"    |        "+item.getPrice()+"    |");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			total=total+(item.getPrice() * item.getQuantity());
		}
		System.out.println(" |   Total                                             |   "+"      "+total);
		return total;
	}

}
