package com.anju.DesignPattern.Structural.Adapter;

public class WeightAdapterImpl_ObjectAdapter {
	WeightMachine machine = new WeightMachine();
	
	public double getWeightInGram() {
		return machine.getWeightInKg() * 1000;
	}

	public void setWeightInGram(double weight) {
		machine.setWeightInKg(weight/1000);
	}

	@Override
	public String toString() {
		return "WeightAdapterImpl_ObjectAdapter [machine=" + machine + "]";
	}	
}
