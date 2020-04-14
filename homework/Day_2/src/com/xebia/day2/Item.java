package com.xebia.day2;

public class Item {

	String itemName;
	int quantity;
	float amount;

	public Item(String itemName, int quantity, float amount) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.amount = amount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	

	static final class ItemBuilder
	{
		
		String itemName;
		int quantity;
		float amount;
		public ItemBuilder setItemName(String itemName) {
			this.itemName = itemName;
			return this;
		}
		public ItemBuilder setQuantity(int quantity) {
			this.quantity = quantity;
			return this;
		}
		public ItemBuilder setAmount(float amount) {
			this.amount = amount;
			return this;
		}
		
		public Item build()
		{
			return new Item(itemName, quantity, amount);
		}
		
		
	}


	public int selectItems(String item, int quantity) {
		if (item.equals(itemName))
		{
			return (int) (quantity * amount);
		}
		return 0;
	}
	
	public int remainingQuantity(String item, int quant) {

		
			if (item.equals(itemName)) {
				return quantity- quant;
		}
		return 0;
	}

}
