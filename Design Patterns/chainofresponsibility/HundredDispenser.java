package com.designpattern.chainofresponsibility;

public class HundredDispenser implements CurrencyDispenseChain {
	
	private CurrencyDispenseChain dispenseChain;
	

	@Override
	public void setNextChain(CurrencyDispenseChain nextChain) {
		this.dispenseChain=nextChain;
		
	}

	@Override
	public void currencyDispense(Currency currency) {
		if(currency.getAmount() >= 100){
			int num = currency.getAmount()/100;
			int remainder = currency.getAmount() % 100;
			System.out.println("Dispensing  '"+num+"' 100$ currency note");
		
			if(remainder !=0) this.dispenseChain.currencyDispense(new Currency(remainder));
		}else{
			this.dispenseChain.currencyDispense(currency);
		
		}
		
	}

}