package com.anju.DesignPattern.Behavioral.State;

public class StateMain {

	public static void main(String[] args) throws InterruptedException {
		TVRemote remote = new TVRemote();
		remote.setState(new StopState());
		remote.OnOffButtonPress();
		
		System.out.println("*****************");
		Thread.sleep(3000);
		remote.setState(new StartState());
		remote.OnOffButtonPress();
	}
}
