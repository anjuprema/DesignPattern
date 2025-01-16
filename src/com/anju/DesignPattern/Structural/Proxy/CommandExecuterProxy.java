package com.anju.DesignPattern.Structural.Proxy;

public class CommandExecuterProxy implements CommandExecuter{
	
	CommandExecuter commandExecuter;
	
	CommandExecuterProxy(String uname, String pswd){
		if("Anju".equals(uname) && "anju@304".equals(pswd)) {
			commandExecuter = new CommandExecuterImpl();
		}
	}
	
	@Override
	public void executeCommand(String command) throws Exception {
		if(commandExecuter != null)
			commandExecuter.executeCommand(command);
		else throw new Exception("Not authorised to execute commands");
	}

}
