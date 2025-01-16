package com.anju.DesignPattern.Creational.AbstractFactory;

public class Outlet {
	
	public static Computer getComputer(ComputerFactory factory) {
		return factory.createComputer();
	}

}
