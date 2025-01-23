package com.anju.DesignPattern.Behavioral.Iterator;

import java.util.ArrayList;

enum LANG {
	ENGLISH,
	DEUTSCH,
	FRENCH,
	ALL
}

public class Channel {
	private LANG language;
	private float frequency;
	
	Channel(LANG lang, float frequency) {
		this.language =  lang;
		this.frequency = frequency;
	}

	public LANG getLanguage() {
		return language;
	}
	
	public float getFrequency() {
		return frequency;
	}

	@Override
	public String toString() {
		return "Channel [language=" + language + ", frequency=" + frequency + "]";
	}	
}

abstract class ChannelIterator {
	abstract boolean hasNext();
	abstract Channel next();
}

abstract class ChannelCollection {
	abstract void addToCollection(Channel channel);
	abstract void removeFromCollection(Channel channel);
	abstract ChannelIterator iterator(LANG language);
}

class ChannelCollectionImpl extends ChannelCollection {
	private ArrayList<Channel> channelList = new ArrayList<>();	
	
	@Override
	void addToCollection(Channel channel) {
		this.channelList.add(channel);
	}

	@Override
	void removeFromCollection(Channel channel) {
		this.channelList.remove(channel);
	}

	@Override
	ChannelIterator iterator(LANG language) {
		return new IteratorImpl(language);
	}
	
	/**
	 * Added as subclass so that iterator can access channelList directly and iterate
	 * through it without being passed as parameter or initialized using constructor.
	 * */
	private class IteratorImpl extends ChannelIterator {
		private LANG lang;
		private int position;
		
		IteratorImpl(LANG language){
			this.lang = language;
		}
		
		@Override
		boolean hasNext() {
			while(position < channelList.size()) {
				Channel c = channelList.get(position);
				if(c.getLanguage().equals(this.lang) || this.lang.equals(LANG.ALL)) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}

		@Override
		Channel next() {
			Channel nextItem =  channelList.get(position);
			position++;
			return nextItem;
		}		
	}
}
