package com.anju.DesignPattern.Creational.Builder;

public class MainBuilder {

	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("200BG", "2GB", "2.4GHz").setColor("Grey").setScreenSize("14inch").setWeight("Under 2kg").build();
		System.out.println(comp);
	}

}
