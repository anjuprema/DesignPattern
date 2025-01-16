package com.anju.DesignPattern.Structural.Decorator;

public class DecoratorMain {
	public static void main (String args[]) {
		Icecream icecream = new SprinklesTopping(new ChocodipTopping(new VanillaIcecream()));
		icecream.make();
		
		System.out.println();
		
		icecream = new ChocodipTopping(new VanillaIcecream());
		icecream.make();
		
		System.out.println();
		
		icecream = new ChocodipTopping(new SprinklesTopping(new VanillaIcecream()));
		icecream.make();
	}
}
