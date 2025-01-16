package com.anju.DesignPattern.Structural.Facade;

public class FacadeClientMain {

	public static void main(String[] args) {
		System.out.println("Client clicked start button..");
		ACFacade acFacade = new ACFacade();
		acFacade.startAC();
	}

}
