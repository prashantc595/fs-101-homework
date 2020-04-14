package com.xebia.day2;

public class AwesomeBakery {

	static int paybleAmount;

	public static void main(String[] args) {

		User ram = new User("Ram", 5000);
		User shaam = new User("Shaam", 2500);

		// food vending
		Item item_candy = new Item.ItemBuilder().setItemName("Candies").setQuantity(100).setAmount(1).build();
		Item item_muffin = new Item.ItemBuilder().setItemName("Muffins").setQuantity(50).setAmount(50).build();
		Item item_choco = new Item.ItemBuilder().setItemName("Chocos").setQuantity(30).setAmount(100).build();
		
		// drink beverage 
		
		Item soft_drink = new Item.ItemBuilder().setItemName("Soft Drinks").setQuantity(10).setAmount(15).build();
		Item apple_beer = new Item.ItemBuilder().setItemName("Apple Beer").setQuantity(20).setAmount(75).build();

		// 1. Ram buys 30 candies

		paybleAmount = item_candy.selectItems("Candies", 30);

		System.out.println("Ram has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + ram.pay(paybleAmount));
		System.out.println("Remaining Candies : " + item_candy.remainingQuantity("Candies", 30));

		// 2. Shaam buys 10 Muffins

		paybleAmount = item_muffin.selectItems("Muffins", 10);

		System.out.println("Shaam has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + shaam.pay(paybleAmount));
		System.out.println("Remaining Muffins : " + item_muffin.remainingQuantity("Muffins", 10));

		// 3. Shaam buys 5 chocolates

		paybleAmount = item_choco.selectItems("Chocos", 5);

		System.out.println("Shaam has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + shaam.pay(paybleAmount));
		System.out.println("Remaining Chocolate Cakes : " + item_choco.remainingQuantity("Chocos", 5));

		// 4. Ram bus 3 chocolate cakes

		paybleAmount = item_choco.selectItems("Chocos", 3);

		System.out.println("Ram has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + ram.pay(paybleAmount));
		System.out.println("Remaining Chocolate Cakes : " + item_choco.remainingQuantity("Chocos", 3));

		// 5. Ram buys 2 Apple beer

		paybleAmount = apple_beer.selectItems("Apple Beer", 2);

		System.out.println("Ram has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + ram.pay(paybleAmount));
		System.out.println("Remaining Apple Beers : " + apple_beer.remainingQuantity("Apple Beer", 2));

		// 6. Shaam buys 3 soft drinks

		paybleAmount = soft_drink.selectItems("Soft Drinks", 3);

		System.out.println("Shaam has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + shaam.pay(paybleAmount));
		System.out.println("Remaining Soft Drinks : " + soft_drink.remainingQuantity("Soft Drinks", 3));

		// 7.Ram buys 2 soft drinks

		paybleAmount = soft_drink.selectItems("Soft Drinks", 2);

		System.out.println("Ram has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + ram.pay(paybleAmount));
		System.out.println("Remaining Soft Drinks : " + soft_drink.remainingQuantity("Soft Drinks", 2));

		// 8.Shaam buys 5 Chocolate cakes

		paybleAmount = item_choco.selectItems("Chocos", 5);

		System.out.println("Shaam has to pay Rs." + paybleAmount);
		System.out.println("Amout left in his wallet is Rs. " + shaam.pay(paybleAmount));
		System.out.println("Remaining Chocolate Cakes : " + item_choco.remainingQuantity("Chocos", 5));

	}
}
