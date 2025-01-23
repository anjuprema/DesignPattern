package com.anju.DesignPattern.Behavioral.Visitor;

public abstract class Shape {
	abstract void acceptVisitor(Visitor visitor);
}

class Circle extends Shape {
	Integer radius;
	
	Circle(Integer radius){
		this.radius = radius;
	}

	@Override
	void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}
}

class Square extends Shape {
	Integer side;
	
	Square(Integer side){
		this.side = side;
	}

	@Override
	void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}
}

class Rectangle extends Shape {
	Integer length;
	Integer breadth;
	
	Rectangle(Integer length, Integer breadth){
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}
}

interface Visitor {
	void visit(Circle circle);
	void visit(Square square);
	void visit(Rectangle rectangle);
}

class AreaCalculator implements Visitor {

	@Override
	public void visit(Circle circle) {
		System.out.println("Area of circle = "+ (3.14 * circle.radius * circle.radius));
	}

	@Override
	public void visit(Square square) {
		System.out.println("Area of Square = "+ (square.side * square.side));
	}

	@Override
	public void visit(Rectangle rectangle) {
		System.out.println("Area of Rectangle = "+ (rectangle.length * rectangle.breadth));
	}	
}

class DrawShape implements Visitor {
	@Override
	public void visit(Circle circle) {
		System.out.println("Drawing circle..");
	}

	@Override
	public void visit(Square square) {
		System.out.println("Drawing square..");
	}

	@Override
	public void visit(Rectangle rectangle) {
		System.out.println("Drawing rectangle..");
	}
}