package com.anju.DesignPattern.Creational.Prototype;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPrototype {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList(Arrays.asList("Grey","Silver","Pink"));
		Integer[] size = {12, 14, 18};
		Computer computer = new Computer(color, size);
		System.out.println(computer);
		Computer clone = computer.clone();
		ArrayList l = clone.getColor();
		l.add("BLACK");
		l.remove("Grey");
		
		Integer[] c = clone.getSize();
		c[c.length-1] = 20;
		c[0] = null;
		
		System.out.println(clone);
		System.out.println(computer);
	}

}
