package com.anju.DesignPattern.Behavioral.Iterator;

public class IteratorMain {
	public static void main(String[] args) {
		ChannelCollectionImpl station = new ChannelCollectionImpl();
		station.addToCollection(new Channel(LANG.ENGLISH, 93.6f));
		station.addToCollection(new Channel(LANG.DEUTSCH, 100.9f));
		station.addToCollection(new Channel(LANG.FRENCH, 102.1f));
		station.addToCollection(new Channel(LANG.ENGLISH, 93.4f));
		station.addToCollection(new Channel(LANG.DEUTSCH, 100.8f));
		station.addToCollection(new Channel(LANG.FRENCH, 102.2f));
		station.addToCollection(new Channel(LANG.ENGLISH, 93.5f));
		station.addToCollection(new Channel(LANG.DEUTSCH, 100.7f));
		station.addToCollection(new Channel(LANG.FRENCH, 102.3f));
		station.addToCollection(new Channel(LANG.ENGLISH, 93.2f));
		station.addToCollection(new Channel(LANG.DEUTSCH, 100.6f));
		station.addToCollection(new Channel(LANG.FRENCH, 102.4f));
		
		System.out.println("English channels..");
		ChannelIterator it = station.iterator(LANG.ENGLISH);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("All channels..");
		it = station.iterator(LANG.ALL);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("Deutsch channels..");
		it = station.iterator(LANG.DEUTSCH);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
