package com.anju.DesignPattern.Behavioral.State;

public class TVRemote {
	private TVState tvState;
	
	public void setState(TVState state) {
		this.tvState = state;
	}
	
	public void OnOffButtonPress() {
		System.out.println("TV ON/OFF button pressed..");
		this.tvState.doAction();
	}
}

abstract class TVState{
	abstract void doAction();
}

class StartState extends TVState {
	@Override
	void doAction() {
		System.out.println("TV is start state.. switching off now..");
	}	
}

class StopState extends TVState {
	@Override
	void doAction() {
		System.out.println("TV is stopped state.. switching on now..");
	}	
}