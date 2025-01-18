package com.anju.DesignPattern.Behavioral.Mediator;

import java.util.ArrayList;

interface AuctionMediator {
	ArrayList<Bidder> bidders = new ArrayList();
	
	void addABidder(Bidder bidder);
	public void receiveBid(Integer bidAmount);
	public void sendMessage(Bidder name, Integer bidAmount);
}

class Mediator implements AuctionMediator{
	
	Mediator(){		
	}
	
	@Override
	public void addABidder(Bidder bidder) {
		this.bidders.add(bidder);
	}

	@Override
	public void receiveBid(Integer bidAmount) {
		BidderIndividual highestBidder = (BidderIndividual) bidders.stream().sorted((a,b) -> b.getBidAmount()-a.getBidAmount()).limit(1).findFirst().get();
		if(bidAmount > highestBidder.getBidAmount()) {
			bidders.forEach(b -> sendMessage(b, bidAmount));
		}else {
			bidders.forEach(b -> sendMessage(b, highestBidder.getBidAmount()));
		}
	}

	@Override
	public void sendMessage(Bidder bidder, Integer bidAmount) {
		bidder.receiveBidMessage("Bid settled for "+bidAmount);
	}
	
}

abstract class Bidder {
	String name;
	Integer bidAmount;
	AuctionMediator mediator;
	
	Bidder(AuctionMediator mediator, String name, Integer bidAmount){
		this.mediator = mediator;
		this.name = name;
		this.bidAmount = bidAmount;
	}
	
	Integer getBidAmount() {
		return bidAmount;
	}
	
	abstract void placeBid(Integer bidAmount);
	abstract void receiveBidMessage(String message);
}

class BidderIndividual extends Bidder {
	
	BidderIndividual(AuctionMediator mediator, String name, Integer bidAmount){
		super(mediator, name, bidAmount);
	}
	
	@Override
	public void placeBid(Integer bidAmount) {
		this.bidAmount =  bidAmount;
		mediator.receiveBid(bidAmount);
	}

	@Override
	void receiveBidMessage(String message) {
		System.out.println(this.name + " received message: "+message);
	}
	
}
