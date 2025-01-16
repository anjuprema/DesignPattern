package com.anju.DesignPattern.Structural.Bridge;

abstract class Color {
	abstract void fillColor();
}

class Red extends Color {
	@Override
	void fillColor() {
		System.out.println("Fill with color RED..");
	}	
}

class Green extends Color {
	@Override
	void fillColor() {
		System.out.println("Fill with color GREEN..");
	}	
}

class Yellow extends Color {
	@Override
	void fillColor() {
		System.out.println("Fill with color YELLOW..");
	}	
}