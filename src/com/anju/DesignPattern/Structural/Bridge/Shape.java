package com.anju.DesignPattern.Structural.Bridge;

abstract class Shape {
	Color color;
	
	Shape(Color c){
		this.color = c;
	}
	
	abstract void drawFigure();
}

class Triangle extends Shape{
	Triangle(Color c) {
		super(c);
	}

	@Override
	void drawFigure() {
		System.out.println("Drawing triangle..");
		color.fillColor();
	}	
}

class Square extends Shape{
	Square(Color c) {
		super(c);
	}

	@Override
	void drawFigure() {
		System.out.println("Drawing square..");
		color.fillColor();
	}	
}

class Circle extends Shape{
	Circle(Color c) {
		super(c);
	}

	@Override
	void drawFigure() {
		System.out.println("Drawing circle..");
		color.fillColor();
	}	
}
