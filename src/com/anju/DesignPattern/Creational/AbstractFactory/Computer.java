package com.anju.DesignPattern.Creational.AbstractFactory;

public abstract class Computer {
	String ram;
	String hdd;
	String cpu;
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU ();
}
