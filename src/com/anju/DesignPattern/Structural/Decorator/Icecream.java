package com.anju.DesignPattern.Structural.Decorator;

interface Icecream {
	void make();
}

class VanillaIcecream implements Icecream {
	@Override
	public void make() {
		System.out.print("Make vanilla Icecream ");
	}	
}

class IcecreamDecorator extends VanillaIcecream {
	Icecream icecream;
	
	IcecreamDecorator(Icecream icecream){
		this.icecream = icecream;
	}

	@Override
	public void make() {
		icecream.make();
	}
}

class ChocodipTopping extends IcecreamDecorator {

	ChocodipTopping(Icecream icecream) {
		super(icecream);
	}
	
	public void make() {
		super.make();
		System.out.print(", add choco dip topping");
	}
}

class SprinklesTopping extends IcecreamDecorator {

	SprinklesTopping(Icecream icecream) {
		super(icecream);
	}
	
	public void make() {
		super.make();
		System.out.print(", add sprinkles topping");
	}
}