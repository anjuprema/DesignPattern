package com.anju.DesignPattern.Structural.Bridge;

abstract class LivingThing {
	abstract void breath();
}

class LandAnimal extends LivingThing{
	BreathingProcess breath;
	
	LandAnimal(BreathingProcess breath){
		this.breath = breath;
	}
	
	@Override
	void breath() {
		this.breath.breath();
		this.breath.inhale();
		this.breath.exhale();
	}	
}

class WaterAnimal extends LivingThing{
	BreathingProcess breath;
	
	WaterAnimal(BreathingProcess breath){
		this.breath = breath;
	}
	
	@Override
	void breath() {
		this.breath.breath();
		this.breath.inhale();
		this.breath.exhale();
	}	
}

class Plant extends LivingThing{
	BreathingProcess breath;
	
	Plant(BreathingProcess breath){
		this.breath = breath;
	}
	
	@Override
	void breath() {
		this.breath.breath();
		this.breath.inhale();
		this.breath.exhale();
	}	
}