package com.designpattern.chainofresponsibility;

import java.util.Scanner;

public class ATMWithdrawal {
	
	private CurrencyDispenseChain c1;

	public ATMWithdrawal() {
		
		// initialise the chain
		this.c1 = new FiveThousandDispenser();
		CurrencyDispenseChain c2 = new ThousandDispenser();
		CurrencyDispenseChain c3 = new FiveHundredDispenser();
		CurrencyDispenseChain c4 = new HundredDispenser();

		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		c3.setNextChain(c4);
		
	}
	
	
	public static void main(String[] args) {
		
		ATMWithdrawal atmWithdrawal = new ATMWithdrawal();
		
		while (true) {
			int amount = 0;
			System.out.println("Please enter the price to dispense:");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if(amount > 100000){
				
				System.out.println("Daily withdrawal limit is 100000$.  Try again!");
				return ;
				
			}else if(amount % 100 != 0) {
				System.out.println("Price should be in multiple of 100s, Try again!");
				return;
			}
			
			// process the request
			atmWithdrawal.c1.currencyDispense(new Currency(amount));
		}
	}
	

}
