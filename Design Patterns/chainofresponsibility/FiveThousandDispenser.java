package com.designpattern.chainofresponsibility;

public class FiveThousandDispenser implements CurrencyDispenseChain {
	
	private CurrencyDispenseChain dispenseChain;
	

	@Override
	public void setNextChain(CurrencyDispenseChain nextChain) {
		this.dispenseChain=nextChain;
		
	}

	@Override
	public void currencyDispense(Currency currency) {
		if(currency.getAmount() >= 5000){
			int num = currency.getAmount()/5000;
			int remainder = currency.getAmount() % 5000;
			System.out.println("Dispensing  '"+num+"' 5000$ currency note");
		
			if(remainder !=0) this.dispenseChain.currencyDispense(new Currency(remainder));
		}else{
			this.dispenseChain.currencyDispense(currency);
		
		}
		
	}

	

}
