package com.designpattern.builderpattern;



public class Phone {
	
		private final String memoryCard;  //required parameters
		private final String RAM;  //required parameters
		private final boolean isBluetoothEnabled;    //optional parameters
		
	  
		 public Phone(Builder builder) {
			  this.memoryCard=builder.memoryCard;
			  this.RAM=builder.RAM;
			  this.isBluetoothEnabled=builder.isBluetoothEnabled;
			
			    	
			}

	    //Builder Class
	    static class Builder{
	    	
	    	private String memoryCard;  //required parameters
			private String RAM;  //required parameters
			private boolean isBluetoothEnabled;    //optional parameters
			
			
			//build method
			 public Phone build() {
		 	    	return new Phone(this);
		 	    }
			 
			
			 public Builder(String memoryCard, String RAM){
					this.memoryCard=memoryCard;
					this.RAM=RAM;
	    }
			 //Take isBluetoothEnabled and assign to this & return the current instance
			 public Builder isBluetoothEnabled(boolean isBluetoothEnabled) {
				 this.isBluetoothEnabled=isBluetoothEnabled;
				 return this;
			 }
			 
			
	   }

		@Override
		public String toString() {
			return "Phone [memoryCard=" + memoryCard +
					", RAM=" + RAM + 
					", isBluetoothEnabled=" + isBluetoothEnabled
					+ "]";
		}

		
		
		
	    
	    
}
