package com.anju.DesignPattern.Structural.Adapter;


public class WeightMain {
	public static void main(String args[]) {
		WeightAdapterImpl_ObjectAdapter adapter = new WeightAdapterImpl_ObjectAdapter();
		adapter.setWeightInGram(5000);
		System.out.println(adapter.getWeightInGram());
		System.out.println(adapter);
	}
}
