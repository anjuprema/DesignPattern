package com.anju.DesignPattern.Behavioral.Iterator;

import java.util.ArrayList;

enum ResultStatus {
	PASS,
	FAILL
}

public class StudentSample2 {
	private String name;
	private Integer mark;
	private ResultStatus result;
	
	StudentSample2(String name, Integer mark) {
		this.name = name;
		this.mark = mark;
		if(mark >= 40) {
			this.result = ResultStatus.PASS;
		}else {
			this.result = ResultStatus.FAILL;
		}
	}
	
	public ResultStatus getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "StudentSample2 [name=" + name + ", mark=" + mark + ", result=" + result + "]";
	}	
}

class StudentList {
	ArrayList<StudentSample2> studList = new ArrayList<>();	
	
	public void addStudent(StudentSample2 student) {
		studList.add(student);
	}
	
	public void removeStudent(StudentSample2 student) {
		studList.remove(student);
	}
	
	public StudentIterator iterator(ResultStatus result) {
		return new StudentIteratorImpl(result);
	}
	
	private class StudentIteratorImpl implements StudentIterator {
		ResultStatus status;
		Integer position = 0;
		
		StudentIteratorImpl(ResultStatus status){
			this.status = status;
		}
		
		@Override
		public boolean hasNext() {
			while(position < studList.size()) {
				if(studList.get(position).getResult().equals(status)) {
					return true;
				}
				position++;
			}
			return false;
		}

		@Override
		public StudentSample2 next() {
			StudentSample2 stud = studList.get(position);
			position++;
			return stud;
		}		
	} 
}

interface StudentIterator {
	boolean hasNext();
	StudentSample2 next();
}