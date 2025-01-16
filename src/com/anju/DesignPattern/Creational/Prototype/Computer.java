package com.anju.DesignPattern.Creational.Prototype;

import java.util.ArrayList;
import java.util.Arrays;

public class Computer implements Cloneable{
	ArrayList<String> color;
	Integer[] size;
	
	public Computer(ArrayList<String> color, Integer[] size) {
		super();
		this.color = color;
		this.size = size;
	}	
	
	public ArrayList<String> getColor() {
		return color;
	}

	public void setColor(ArrayList<String> color) {
		this.color = color;
	}

	public Integer[] getSize() {
		return size;
	}

	public void setSize(Integer[] size) {
		this.size = size;
	}

	public Computer clone() {
		ArrayList<String> tempAL = new ArrayList();
		for(String c : color) {
			tempAL.add(c);
		}
		
		Integer[] tempAR = new Integer[size.length];
		for(int i=0; i<size.length; i++) {
			tempAR[i] = size[i];
		}
		
		return new Computer(tempAL, tempAR);
	}

	@Override
	public String toString() {
		return "Computer [color=" + color + ", size=" + Arrays.toString(size) + "]";
	}		
}
