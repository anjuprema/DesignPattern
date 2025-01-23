package com.anju.DesignPattern.Behavioral.Command;

public class CommandMain {

	public static void main(String[] args) {
		ACRemote remote = new ACRemote();
		AirConditioner ac = new AirConditioner();
		remote.setCommand(new StartACCommand(ac));
		remote.buttonPress();
		System.out.println("******************");
		remote.setCommand(new StopACCommand(ac));
		remote.buttonPress();
	}

}
