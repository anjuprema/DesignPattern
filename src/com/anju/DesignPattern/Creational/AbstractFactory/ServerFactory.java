package com.anju.DesignPattern.Creational.AbstractFactory;

public class ServerFactory implements ComputerFactory {
	private String ram;
	private String hdd;
	private String cpu;
	
	ServerFactory(String ram, String hdd, String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}
}
