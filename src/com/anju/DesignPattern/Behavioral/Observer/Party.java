package com.anju.DesignPattern.Behavioral.Observer;

import java.util.ArrayList;

interface Party {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void organiseNewEvent(String event);
	void sendEventNotification();
	String getEventUpdate();
}

class Event implements Party{
	ArrayList<Observer> observers = new ArrayList();
	String message;
	
	@Override
	public void addObserver(Observer observer) {
		if(observer != null) {
			observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observer != null) {
			observers.remove(observer);
		}
	}
	
	@Override
	public void organiseNewEvent(String event) {
		this.message = event;
		this.sendEventNotification();
	}

	@Override
	public void sendEventNotification() {
		if(observers.size() > 0 && this.message != null) {
			for(Observer observer: observers) {
				observer.getNotification();
			}
		}
	}

	@Override
	public String getEventUpdate() {
		return this.message;
	}		
}

interface Observer {
	void getNotification();
}

class EventObserver implements Observer {
	Event event;
	String name;
	
	EventObserver(Event event, String name){
		this.event =  event;
		this.name = name;
	}

	@Override
	public void getNotification() {
		String message = event.getEventUpdate();
		if(message != null) {
			System.out.println(this.name + " receiving message :> "+ message);
		}
	}
}
