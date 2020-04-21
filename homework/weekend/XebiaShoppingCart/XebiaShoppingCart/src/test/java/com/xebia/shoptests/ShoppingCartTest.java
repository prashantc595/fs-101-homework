package com.xebia.shoptests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.xebia.shop.Item;
import com.xebia.shop.ItemType;
import com.xebia.shop.ShoppingCart;

public class ShoppingCartTest {

	@Test
	public void add_items_to_cart()
	{
		ShoppingCart cart=new ShoppingCart();
		cart.addItems(new Item("Java Deep Dive",ItemType.BOOK, 2799), 2);
		
		int itemcount = cart.totalNumberOfItemsInCart();
		
		assertThat(itemcount).isEqualTo(2);
	}
	
	@Test
	public void add_more_than_one_item_to_cart()
	{
		ShoppingCart cart=new ShoppingCart();
		
		cart.addItems(new Item("Cross",ItemType.PEN, 1799),1);
		cart.addItems(new Item("Puma",ItemType.TSHIRT, 1999),1);
		cart.addItems(new Item("Calender",ItemType.CALENDER, 450),1);
		
		int itemcount=cart.totalNumberOfItemsInCart();
		
		assertThat(itemcount).isEqualTo(3);
	}
	
	@Test
	public void remove_item_from_cart()
	{
		ShoppingCart cart=new ShoppingCart();
		
		cart.removeItem(new Item("Calender",ItemType.CALENDER, 450));
		
		int itemcount=cart.totalNumberOfItemsInCart();
		
		assertThat(itemcount).isEqualTo(0);
	}
	
	@Test
	public void view_items_from_cart()
	{
		ShoppingCart shopcart=new ShoppingCart();
		
		shopcart.addItems(new Item("Puma",ItemType.TSHIRT, 1999),1);
		shopcart.addItems(new Item("Java Deep Dive",ItemType.BOOK, 2799),1);
		
		List<Item> items=shopcart.viewItems();
		
		assertThat(items.get(0).getPrice()).isEqualTo(1999);
		assertThat(items.get(1).getPrice()).isEqualTo(2799);
		
		// Total Price Test Case
		double totalPrice=shopcart.totalCartPrice();
		
		assertThat(totalPrice).isEqualTo(items.get(0).getPrice()+items.get(1).getPrice());
	}
	
}
	
	
