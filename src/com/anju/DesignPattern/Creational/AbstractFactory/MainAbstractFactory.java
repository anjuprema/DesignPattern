package com.anju.DesignPattern.Creational.AbstractFactory;

public class MainAbstractFactory {
	public static void main(String[] args) {
		Computer pc = Outlet.getComputer(new PCFactory("2GB", "200GB", "2.4GHz"));
		System.out.println(pc);
		Computer s = Outlet.getComputer(new ServerFactory("16GB", "1TB", "2.9THz"));
		System.out.println(s);
	}

}
