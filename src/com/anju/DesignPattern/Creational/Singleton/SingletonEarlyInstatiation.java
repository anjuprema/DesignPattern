package com.anju.DesignPattern.Creational.Singleton;

class SingletonEarly{
	private static SingletonEarly singletonObj = new SingletonEarly();
	private int i;
	
	private SingletonEarly() {}
	
	public static SingletonEarly getSingletonObj() {
		return singletonObj;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

public class SingletonEarlyInstatiation {

	public static void main(String[] args) {
		SingletonEarly a = SingletonEarly.getSingletonObj();
		a.setI(100);
		System.out.println(a.getI());
		
		SingletonEarly b = SingletonEarly.getSingletonObj();
		System.out.println(b.getI());
		b.setI(200);
		System.out.println(a.getI() + ","+ b.getI());
	}

}
