package com.anju.DesignPattern.Structural.Facade;

public class ACExternalUnit {
	void checkVoltage() {
		System.out.println("External Unit voltage check done..");
	}
	
	void consumeNitrogen() {
		System.out.println("External Unit start consuming nitrogen..");
	}
	
	void startCondensor() {
		System.out.println("External Unit started condensor..");
	}
}
