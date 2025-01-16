package com.anju.DesignPattern.Structural.Flyweight;

import java.util.Random;

public class FlyweightRoboMain {

	public static void main(String[] args) {
		RoboFactory factory = new RoboFactory();
		Random random = new Random();
		for(int i=0; i<10; i++) {
			Robot humanoid = factory.getRobot(RoboType.HUMANOID);
			humanoid.display(random.nextInt(100), random.nextInt(100));
		}
		
		//only one object created
		RoboFactory.showData();
		
		for(int i=0; i<20; i++) {
			Robot robodog = factory.getRobot(RoboType.ROBODOG);
			robodog.display(random.nextInt(100), random.nextInt(100));
		}
		
		//only 2 objects created
		RoboFactory.showData();
	}
}
