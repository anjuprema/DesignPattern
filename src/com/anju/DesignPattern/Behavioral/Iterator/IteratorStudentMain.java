package com.anju.DesignPattern.Behavioral.Iterator;

public class IteratorStudentMain {
	public static void main(String[] args) {
		StudentList class5A = new StudentList();
		class5A.addStudent(new StudentSample2("Anju", 70));
		class5A.addStudent(new StudentSample2("Prema", 39));
		class5A.addStudent(new StudentSample2("Appu", 83));
		class5A.addStudent(new StudentSample2("Ponna", 40));
		class5A.addStudent(new StudentSample2("Dinesh", 10));
		class5A.addStudent(new StudentSample2("Payal", 45));
		class5A.addStudent(new StudentSample2("Jiya", 100));
		
		System.out.println("Passed Students");
		StudentIterator it = class5A.iterator(ResultStatus.PASS);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("Failed Students");
		it = class5A.iterator(ResultStatus.FAILL);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
