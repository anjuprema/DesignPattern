package com.anju.DesignPattern.Behavioral.Command;

public class ACRemote {
	CommandInvoker command;
	
	public void setCommand(CommandInvoker command) {
		this.command = command;
	}
	
	public void buttonPress() {
		this.command.execute();
	}
}

abstract class CommandInvoker{
	abstract void execute();
}

class StartACCommand extends CommandInvoker {
	AirConditioner ac;
	
	StartACCommand(AirConditioner ac){
		this.ac = ac;
	}
	
	@Override
	void execute() {
		ac.checkVoltage();
		ac.setTemparature();
		ac.turnOnAC();
	}	
}

class StopACCommand extends CommandInvoker {
	AirConditioner ac;
	
	StopACCommand(AirConditioner ac){
		this.ac = ac;
	}
	
	@Override
	void execute() {
		ac.setTemparature();
		ac.turnOffAC();
	}	
}

class AirConditioner {
	public void checkVoltage() {
		System.out.println("Voltage check completed..");
	}
	
	public void setTemparature() {
		System.out.println("Temparature setting completed..");
	}
	
	public void turnOnAC() {
		System.out.println("AC Turn ON completed..");
	}
	
	public void turnOffAC() {
		System.out.println("AC Turn Off completed..");
	}
}