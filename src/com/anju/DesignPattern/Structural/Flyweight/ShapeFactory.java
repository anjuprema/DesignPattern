package com.anju.DesignPattern.Structural.Flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Random;


enum ShapeType {
	CIRCLE,
	LINE
} 

public class ShapeFactory {
	private static final HashMap<ShapeType, Shape> shapes = new HashMap<>();
	
	public static void draw(ShapeType type, Graphics graphics) {
		Shape shape = shapes.get(type);
		Random random = new Random();
		if(shape == null) {
			if(type == ShapeType.CIRCLE) {
				shape = new Circle(Color.RED, 50);				
			} else if(type ==  ShapeType.LINE) {
				shape = new Line(Color.GREEN, 5);
			}
			shapes.put(type, shape);
		}
		shape.drawShape(graphics, random.nextInt(500), random.nextInt(500));
	}
}
