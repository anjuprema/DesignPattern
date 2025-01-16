package com.anju.DesignPattern.Structural.Composite;

import java.util.ArrayList;

interface Shape {
	void draw(String color);
}

class Triangle implements Shape {
	@Override
	public void draw(String color) {
		System.out.println("Draw triangle in color "+ color);
	}	
}

class Circle implements Shape {
	@Override
	public void draw(String color) {
		System.out.println("Draw circle in color "+ color);
	}	
}

class Square implements Shape {
	@Override
	public void draw(String color) {
		System.out.println("Draw square in color "+ color);
	}	
}

class Painting implements Shape{
	ArrayList<Shape> painting = new ArrayList();
	
	public void add(Shape shape) {
		painting.add(shape);
	}
	
	@Override
	public void draw(String color) {
		for(Shape shape: painting) {
			shape.draw(color);
		}		
	}
	
}

public class DrawingSample2 {

	public static void main(String[] args) {
		Painting painting = new Painting();
		painting.add(new Triangle());
		painting.add(new Square());
		painting.add(new Circle());
		
		painting.draw("red");
		painting.draw("green");
	}

}
