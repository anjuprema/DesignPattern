package com.anju.DesignPattern.Behavioral.Memento;

public class MementoMain {

	public static void main(String[] args) {
		FileEditor fe = new FileEditor("MyHobby", "My hobby is pinting");
		FileCaretaker caretaker = new FileCaretaker();
		caretaker.saveState(fe.createMemento());
		
		fe.setFileContent("My hobbies are dancing and acting");
		caretaker.saveState(fe.createMemento());
		
		fe.setFileContent("I dont have any hobby");
		
		System.out.println(fe);
		fe.restoreMemento(caretaker.undo());
		System.out.println("UNDO -> " + fe);
		fe.restoreMemento(caretaker.undo());
		System.out.println("UNDO -> " +fe);

	}

}
