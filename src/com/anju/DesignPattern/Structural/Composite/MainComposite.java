package com.anju.DesignPattern.Structural.Composite;

public class MainComposite {

	public static void main(String[] args) {
		DirectoryItem root = new DirectoryItem("ROOT");		
		FileItem rf1 = new FileItem("file 1");
		DirectoryItem dir1 = new DirectoryItem("Directory 1");
		root.add(rf1); root.add(dir1);
		FileItem rf2 = new FileItem("file 2");
		FileItem rf3 = new FileItem("file 3");
		dir1.add(rf2); dir1.add(rf3);
		root.listFile();
	}

}
