package com.anju.DesignPattern.Structural.Flyweight;

import java.awt.Color;
import java.awt.Graphics;

interface Shape {
	void drawShape(Graphics graphic, int x, int y);
}

class Circle implements Shape {
	Color color;
	int width;
	
	Circle(Color color, int width){
		this.color = color;
		this.width = width;
	}
	
	@Override
	public void drawShape(Graphics graphic, int x, int y) {
		graphic.setColor(this.color);
		graphic.drawOval(x, y, this.width, this.width);		
	}	
}

class Line implements Shape {
	Color color;
	int width;
	
	Line(Color color, int width){
		this.color = color;
		this.width = width;
	}
	
	@Override
	public void drawShape(Graphics graphic, int x, int y) {
		graphic.setColor(this.color);
		graphic.drawLine(x, y, x+50, y+50);		
	}
}