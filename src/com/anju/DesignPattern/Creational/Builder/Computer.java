package com.anju.DesignPattern.Creational.Builder;

public class Computer {
	//mandatory params
	private String hdd;
	private String ram;
	private String cpu;
	
	//optional params
	private String color;
	private String weight;
	private String screenSize;
	
	public Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.color = builder.color;
		this.weight = builder.weight;
		this.screenSize = builder.screenSize;
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", cpu=" + cpu + ", color=" + color + ", weight=" + weight
				+ ", screenSize=" + screenSize + "]";
	}

	public static class ComputerBuilder{
		//mandatory params
		private String hdd;
		private String ram;
		private String cpu;
		
		//optional params
		private String color;
		private String weight;
		private String screenSize;
		
		public ComputerBuilder(String hdd, String ram, String cpu) {
			this.hdd = hdd;
			this.ram = ram;
			this.cpu = cpu;
		}

		public ComputerBuilder setColor(String color) {
			this.color = color;
			return this;
		}

		public ComputerBuilder setWeight(String weight) {
			this.weight = weight;
			return this;
		}

		public ComputerBuilder setScreenSize(String screenSize) {
			this.screenSize = screenSize;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}

}
