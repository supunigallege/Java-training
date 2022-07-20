package com.designpattern.builderpattern;

public class Application {

	public static void main(String[] args) {
	
		
		///Using builder to get the object in a single line 
		//without any inconsistent state or arguments management issues
		
		Phone.Builder builder = new Phone.Builder("16GB", "2GB");
	     
	    Phone phone = builder.isBluetoothEnabled(true).build();
	     
	    System.out.println(phone);
		
	}

}


