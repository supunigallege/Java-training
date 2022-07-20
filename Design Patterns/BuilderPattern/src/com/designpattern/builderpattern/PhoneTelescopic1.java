package com.designpattern.builderpattern;

public class PhoneTelescopic1 {
	
	  String memoryCard;  
	  String RAM;  
	  boolean isBluetoothEnabled;    
	  boolean isGraphicsCardEnabled; 

      
      //Only take memoryCard constructor
      public PhoneTelescopic1(String memoryCard) {
    	  this.memoryCard=memoryCard;
    	  
      }
      //take memoryCard & RAM
      public PhoneTelescopic1(String memoryCard,String RAM) {
    	  this(memoryCard);     
    	  this.RAM=RAM;  
    	   
      }
      
      public PhoneTelescopic1(String memoryCard,String RAM,  boolean isBluetoothEnabled) {
    	  this(memoryCard, RAM);
    	  this.isBluetoothEnabled= isBluetoothEnabled;
    	   
      }
      
   

	@Override
	public String toString() {
		return "PhoneTelescopic1[memoryCard=" + memoryCard + 
				", RAM=" + RAM +
				", isBluetoothEnabled=" + isBluetoothEnabled + 
				", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
				"]";
	}
      
      
      

}
