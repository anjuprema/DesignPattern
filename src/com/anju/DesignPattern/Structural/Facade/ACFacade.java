package com.anju.DesignPattern.Structural.Facade;

public class ACFacade {
	private ACExternalUnit externalUnit = new ACExternalUnit();
	private ACInternalUnit internalUnit = new ACInternalUnit();
	
	void startAC() {
		System.out.println("Facade about to start AC..");
		externalUnit.checkVoltage();
		internalUnit.acceptOnCommand();
		internalUnit.acceptTempatarure();
		externalUnit.startCondensor();		
		externalUnit.consumeNitrogen();
		System.out.println("Facade started the AC complete..");
	}
}
