package com.anju.DesignPattern.Structural.Composite;

public class FileItem implements FileSystem {
	String fileName;
	
	FileItem(String name){
		this.fileName = name;
	}
	
	@Override
	public void listFile() {
		System.out.println(" --> "+ fileName);
	}

}
