package com.anju.DesignPattern.Behavioral.Template;

abstract class BuildHouse {
	private void buildFoundation() {
		System.out.println("Build Foundation common to all houses");
	}	
	abstract void buildPillars();
	abstract void buildWalls();
	abstract void buildWindowsAndDoors();
	
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindowsAndDoors();
		System.out.println("House Built....");
	}
}

class WoodenHouse extends BuildHouse {
	@Override
	void buildPillars() {
		System.out.println("Build pillars coated with wooden material");
	}

	@Override
	void buildWalls() {
		System.out.println("Build walls wooden material");
	}

	@Override
	void buildWindowsAndDoors() {
		System.out.println("Build windows and doors with wooden material");
	}	
}

class GlassHouse extends BuildHouse {
	@Override
	void buildPillars() {
		System.out.println("Build pillars coated with glass material");
	}

	@Override
	void buildWalls() {
		System.out.println("Build walls glass material");
	}

	@Override
	void buildWindowsAndDoors() {
		System.out.println("Build windows and doors with glass material");
	}	
}