package com.anju.DesignPattern.Behavioral.Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		Item book = new Item("Book", 22.35f);
		Item pen = new Item("Pen", 2.09f);
		Item file = new Item("File", 0.33f);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(book);
		cart.addItem(pen);
		cart.addItem(file);
		
		cart.makePayment(new CreditCard("Anju", "30/12/2027"));
		cart.makePayment(new PayPal("Anju", "Prema"));
	}

}
