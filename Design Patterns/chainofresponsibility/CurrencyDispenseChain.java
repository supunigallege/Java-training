package com.designpattern.chainofresponsibility;

public interface CurrencyDispenseChain {
	
	void setNextChain(CurrencyDispenseChain nextChain);
	
	void currencyDispense(Currency currency);

}
