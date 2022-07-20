package com.designpattern.chainofresponsibility;

public class ThousandDispenser implements CurrencyDispenseChain {
	
	private CurrencyDispenseChain dispenseChain;
	

	@Override
	public void setNextChain(CurrencyDispenseChain nextChain) {
		this.dispenseChain=nextChain;
		
	}

	@Override
	public void currencyDispense(Currency currency) {
		if(currency.getAmount() >= 1000){
			int num = currency.getAmount()/1000;
			int remainder = currency.getAmount() % 1000;
			System.out.println("Dispensing  '"+num+"' 1000$ currency note");
		
			if(remainder !=0) this.dispenseChain.currencyDispense(new Currency(remainder));
		}else{
			this.dispenseChain.currencyDispense(currency);
		
		}
		
	}

}
