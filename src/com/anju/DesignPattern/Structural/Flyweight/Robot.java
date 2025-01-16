package com.anju.DesignPattern.Structural.Flyweight;

interface Robot {
	void display(int x, int y);
}

class Humanoid implements Robot{
	//keeping only intrinsic data/ data that are common to all Humanoids
	String color;
	int height;
	
	//initialize only intrinsic pptys
	Humanoid(String color, int height){
		this.color =  color;
		this.height = height;
	}
	
	//extrinsic properties are passed from outside/client
	@Override
	public void display(int x, int y) {
		System.out.println("Place humanoid at x="+ x +" , y="+ y+", color= "+ this.color +", height="+ this.height);
	}
}

class RoboDog implements Robot{
	//keeping only intrinsic data/ data that are common to all Humanoids
	String color;
	int height;
	
	//initialize only intrinsic pptys
	RoboDog(String color, int height){
		this.color =  color;
		this.height = height;
	}
	
	//extrinsic properties are passed from outside/client
	@Override
	public void display(int x, int y) {
		System.out.println("Place robodog at x="+ x +" , y="+ y+", color= "+ this.color +", height="+ this.height);
	}
}