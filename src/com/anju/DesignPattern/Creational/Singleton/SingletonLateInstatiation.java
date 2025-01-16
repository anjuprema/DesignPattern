package com.anju.DesignPattern.Creational.Singleton;

class SingletonLate{
	private static SingletonLate singletonObj;
	private int i;
	
	private SingletonLate() {}
	
	public static SingletonLate getSingletonObject() {
		if(singletonObj == null) {
			singletonObj = new SingletonLate();
		}
		return singletonObj;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}

public class SingletonLateInstatiation {

	public static void main(String[] args) {
		SingletonLate a = SingletonLate.getSingletonObject();
		a.setI(111);
		System.out.println(a.getI());
		
		SingletonLate b = SingletonLate.getSingletonObject();
		System.out.println(b.getI());
		b.setI(222);
		System.out.println(a.getI() + ","+ b.getI());

	}

}
