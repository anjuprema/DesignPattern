package com.anju.DesignPattern.Structural.Bridge;

public class BridgeMain {
	public static void main(String[] args) {
		LandAnimal tiger = new LandAnimal(new BreathUsingLungs());
		System.out.println("Breathing process of tiger is ");
		tiger.breath();
		
		WaterAnimal fish = new WaterAnimal(new BreathUsingGills());
		System.out.println("Breathing process of fish is ");
		fish.breath();
		
		Plant lilly = new Plant(new BreathUsingLeaves());
		System.out.println("Breathing process of plant is ");
		lilly.breath();
		
		System.out.println("*********************************");
		
		Triangle triangle = new Triangle(new Red());
		triangle.drawFigure();
		
		Square square = new Square(new Green());
		square.drawFigure();
		
		Circle circle = new Circle(new Yellow());
		circle.drawFigure();
	}
}
