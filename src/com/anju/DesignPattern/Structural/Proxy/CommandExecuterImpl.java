package com.anju.DesignPattern.Structural.Proxy;

public class CommandExecuterImpl implements CommandExecuter{

	@Override
	public void executeCommand(String command) throws Exception {
		Runtime.getRuntime().exec(command);
		System.out.println("Command '"+ command +"' executed");
	}

}
