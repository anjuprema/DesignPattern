package com.anju.DesignPattern.Structural.Flyweight;

import java.util.HashMap;

enum RoboType {
	HUMANOID,
	ROBODOG
}
public class RoboFactory {
	private static HashMap<RoboType, Robot> robot= new HashMap();
	
	public Robot getRobot(RoboType type) {
		if(robot.get(type) == null) {
			if(type == RoboType.HUMANOID) {
				Robot humanoid = new Humanoid("Red", 6);
				robot.put(type, humanoid);
				return humanoid;
			}
			else if(type == RoboType.ROBODOG) {
				Robot robodog = new RoboDog("Black", 3);
				robot.put(type, robodog);
				return robodog;
			}
			else return null;
		}
		else {
			return robot.get(type);
		}			
	}
	
	public static void showData() {
		System.out.println(robot);
	}
}







































