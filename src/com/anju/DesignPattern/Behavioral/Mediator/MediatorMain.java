package com.anju.DesignPattern.Behavioral.Mediator;

import java.util.ArrayList;

public class MediatorMain {

	public static void main(String[] args) {
		AuctionMediator mediator = new Mediator();
		BidderIndividual Anju = new BidderIndividual(mediator, "Anju", 2000);
		BidderIndividual Prema = new BidderIndividual(mediator, "Prema", 500);
		BidderIndividual Jiya = new BidderIndividual(mediator, "Jiya", 7000);
		
		mediator.addABidder(Anju);
		mediator.addABidder(Prema);
		mediator.addABidder(Jiya);
		
		Jiya.placeBid(8000);
		Anju.placeBid(2000);
		Prema.placeBid(10000);
	}

}
