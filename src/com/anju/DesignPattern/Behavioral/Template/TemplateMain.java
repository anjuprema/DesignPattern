package com.anju.DesignPattern.Behavioral.Template;

public class TemplateMain {

	public static void main(String[] args) {
		BuildHouse woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		
		BuildHouse glassHouse = new GlassHouse();
		glassHouse.buildHouse();
	}

}
