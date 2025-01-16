package com.anju.DesignPattern.Structural.Bridge;

interface BreathingProcess {
	void breath();
	void inhale();
	void exhale();
}

class BreathUsingLungs implements BreathingProcess{
	@Override
	public void breath() {
		System.out.println("Breath using lungs..");
	}

	@Override
	public void inhale() {
		System.out.println("Inhale oxygen..");
	}

	@Override
	public void exhale() {
		System.out.println("Exhale carbondioxide..");
	}	
}

class BreathUsingGills implements BreathingProcess{
	@Override
	public void breath() {
		System.out.println("Breath using gills..");
	}
	
	@Override
	public void inhale() {
		System.out.println("Inhale oxygen..");
	}

	@Override
	public void exhale() {
		System.out.println("Exhale carbondioxide..");
	}
}

class BreathUsingLeaves implements BreathingProcess{
	@Override
	public void breath() {
		System.out.println("Breathing by plant leaves..");
	}
	
	@Override
	public void inhale() {
		System.out.println("Inhale carbondioxide..");
	}

	@Override
	public void exhale() {
		System.out.println("Exhale oxygen..");
	}
}