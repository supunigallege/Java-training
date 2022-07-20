package factory;

public class IcecreamFactory {
	 public Icecream geticecream(String icecreamtype){
	      if(icecreamtype == null){
	         return null;
	      }		
	      
	      if(icecreamtype.equalsIgnoreCase("VANILA")){
	         return new Vanila();
	          
	      } else if(icecreamtype.equalsIgnoreCase("STRAWBERRY")){
	         return new Strawberry();
	         
	      }
	      else if(icecreamtype.equalsIgnoreCase("CHOCOLATE")){
		         return new Chocolate();
		         
		      }
	      
	      return null;
	   }

}
