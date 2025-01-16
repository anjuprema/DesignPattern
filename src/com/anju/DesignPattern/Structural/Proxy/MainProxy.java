package com.anju.DesignPattern.Structural.Proxy;

public class MainProxy {

	public static void main(String[] args) throws Exception {
		CommandExecuter exec = new CommandExecuterProxy("Anju", "anju@304");
		exec.executeCommand("notepad.exe");
		
		CommandExecuter execW = new CommandExecuterProxy("Anju", "wrong_pswd");
		execW.executeCommand("notepad.exe");
	}

}
