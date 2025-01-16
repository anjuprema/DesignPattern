package com.anju.DesignPattern.Structural.Adapter;

public class WeightMachine {
	private double weight;
	
	WeightMachine(){
		
	}
	
	WeightMachine(double weight){
		this.weight = weight;
	}
	
	public double getWeightInKg() {
		return weight;
	}

	public void setWeightInKg(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WeightMachine [weight in kg=" + weight + "]";
	}
	
	
}
