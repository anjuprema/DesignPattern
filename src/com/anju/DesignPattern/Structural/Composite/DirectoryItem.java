package com.anju.DesignPattern.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryItem implements FileSystem {
	String directoryName;
	List<FileSystem> directoryElement = new ArrayList();
	
	DirectoryItem(String name){
		this.directoryName = name;
	}
	
	public void add(FileSystem fs) {
		directoryElement.add(fs);
	}
	
	@Override
	public void listFile() {
		System.out.println("* "+directoryName);
		for(FileSystem fs: directoryElement) {			
			fs.listFile();
		}

	}
}
