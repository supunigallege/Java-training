package com.designpattern.chainofresponsibility;

public class FiveHundredDispenser implements CurrencyDispenseChain {
	
	private CurrencyDispenseChain dispenseChain;
	

	@Override
	public void setNextChain(CurrencyDispenseChain nextChain) {
		this.dispenseChain=nextChain;
		
	}

	@Override
	public void currencyDispense(Currency currency) {
		if(currency.getAmount() >= 500){
			int num = currency.getAmount()/500;
			int remainder = currency.getAmount() % 500;
			System.out.println("Dispensing  '"+num+"' 500$ currency note");
		
			if(remainder !=0) this.dispenseChain.currencyDispense(new Currency(remainder));
		}else{
			this.dispenseChain.currencyDispense(currency);
		
		}
		
	}
	

}
