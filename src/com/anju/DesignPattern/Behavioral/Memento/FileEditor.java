package com.anju.DesignPattern.Behavioral.Memento;

import java.util.ArrayList;

public class FileEditor {
	private String name;
	private String fileContent;
	
	public FileEditor(String name, String content) {
		this.name = name;
		this.fileContent = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
	
	public FileEditorMemento createMemento() {
		return new FileEditorMemento(this.fileContent);
	}
	
	public void restoreMemento(FileEditorMemento memento) {
		this.fileContent = memento.getFileContent();
	}

	@Override
	public String toString() {
		return "FileEditor [name=" + name + ", fileContent=" + fileContent + "]";
	}
}

class FileEditorMemento {
	private String fileContent;
	
	public FileEditorMemento(String content) {
		this.fileContent = content;
	}

	public String getFileContent() {
		return fileContent;
	}
}

class FileCaretaker {
	ArrayList<FileEditorMemento> fileState = new ArrayList<>();
	
	public void saveState(FileEditorMemento memento) {
		fileState.add(memento);
	}
	
	public FileEditorMemento undo() {
		FileEditorMemento lastState = fileState.get(fileState.size()-1);
		fileState.remove(lastState);
		return lastState;
	}
}
