package com.anju.DesignPattern.Behavioral.ChainOfResponsibility;

import java.util.Scanner;

public class ATMMain {
	public static Integer getAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		Integer amount = sc.nextInt();
		return amount;
	}
	public static void main(String args[]) {
		AtmDispensor Rupee500FromAtm = new Rupee500Dispensor();
		AtmDispensor Rupee100FromAtm = new Rupee100Dispensor();
		AtmDispensor Rupee10FromAtm = new Rupee10Dispensor();
		
		Rupee500FromAtm.setNextDispensor(Rupee100FromAtm);
		Rupee100FromAtm.setNextDispensor(Rupee10FromAtm);
		Integer amount = ATMMain.getAmount();		
		while(amount%10 != 0) {
			System.out.println("Enter amount in multiples of 10..");
			amount = ATMMain.getAmount();
		}
		Rupee500FromAtm.dispenseMoney(amount);
	}
}
