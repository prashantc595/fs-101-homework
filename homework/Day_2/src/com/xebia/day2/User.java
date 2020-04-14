package com.xebia.day2;

public class User {

	String name;
	int cashInWallet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCashInWallet() {
		return cashInWallet;
	}

	public void setCashInWallet(int cashInWallet) {
		this.cashInWallet = cashInWallet;
	}

	public User(String name, int cashInWallet) {
		super();
		this.name = name;
		this.cashInWallet = cashInWallet;
	}

	public float pay(int paybleAmount) {
		this.cashInWallet = this.cashInWallet - paybleAmount;
		return this.cashInWallet;
	}

}
