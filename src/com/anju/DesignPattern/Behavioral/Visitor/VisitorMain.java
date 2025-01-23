package com.anju.DesignPattern.Behavioral.Visitor;

public class VisitorMain {
	public static void main(String[] args) {
		Circle c = new Circle(20);
		Square s = new Square(25);
		Rectangle r = new Rectangle(40, 20);
		
		Visitor areaCal = new AreaCalculator();
		c.acceptVisitor(areaCal);
		s.acceptVisitor(areaCal);
		r.acceptVisitor(areaCal);
		
		System.out.println();
		Visitor draw = new DrawShape();
		c.acceptVisitor(draw);
		s.acceptVisitor(draw);
		r.acceptVisitor(draw);
	}

}
