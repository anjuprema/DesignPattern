package com.anju.DesignPattern.Behavioral.Observer;

public class ObserverMain {

	public static void main(String[] args) {
		Event musicevent = new Event();
		Event danceevent = new Event();
		
		EventObserver Anju = new EventObserver(danceevent, "Anju");
		EventObserver Appu = new EventObserver(musicevent, "Appu");
		EventObserver Vijay = new EventObserver(musicevent, "Vijay");
		
		danceevent.addObserver(Anju);
		musicevent.addObserver(Appu);
		musicevent.addObserver(Vijay);
		
		danceevent.organiseNewEvent("New Onam dance program");
		musicevent.organiseNewEvent("New music program at Munchen");
	}

}
