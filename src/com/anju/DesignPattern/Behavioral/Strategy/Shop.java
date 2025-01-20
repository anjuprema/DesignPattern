package com.anju.DesignPattern.Behavioral.Strategy;

import java.util.ArrayList;

interface Shop {
	void addItem(Item item);
	void removeItem(Item item);
	void makePayment(Payment paymentOption);
}

class ShoppingCart implements Shop{
	ArrayList<Item> itemList = new ArrayList();

	@Override
	public void addItem(Item item) {
		itemList.add(item);
	}

	@Override
	public void removeItem(Item item) {
		itemList.remove(item);
	}

	@Override
	public void makePayment(Payment paymentOption) {
		float finalAmount = 0.0f;
		for(Item eachItem: itemList) {
			finalAmount = finalAmount + eachItem.getItemCost();
		}
		paymentOption.makePayment(finalAmount);
	}
}

class Item {
	String itemName;
	float itemCost;
	
	Item(String itemName, float cost){
		this.itemName = itemName;
		this.itemCost = cost;
	}

	public float getItemCost() {
		return itemCost;
	}
}

interface Payment {	
	void makePayment(float amount);
}

class CreditCard implements Payment {
	String cardHolder;
	String dateOfExpiry;
	
	CreditCard(String name, String expiry){
		this.cardHolder = name;
		this.dateOfExpiry = expiry;
	}
	
	public void makePayment(float amount) {
		System.out.println("Making payment using Credit Card >> Amount:"+amount);
	}
}

class PayPal implements Payment {
	String email;
	String passsword;
	
	PayPal(String email, String password){
		this.email = email;
		this.passsword = password;
	}
	
	public void makePayment(float amount) {
		System.out.println("Making payment using PayPal >> Amount:"+amount);
	}
}