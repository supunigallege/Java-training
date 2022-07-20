package prototype;

import java.util.Hashtable;

public class Icecreamstore {
	
	private static Hashtable<String, Icecream> shapeMap  = new Hashtable<String, Icecream>();

	   public static Icecream getIcecream(String Icecreamno) {
		Icecream storedIcecream = shapeMap.get(Icecreamno);
	   return (Icecream) storedIcecream.clone();
	  }
	   
	   
	  
	   public static void loadCache() {
		     Vanila vanila = new Vanila();
		     vanila.setId("1");
		      shapeMap.put(vanila.getId(),vanila);

		      Strawberry strawberry = new Strawberry();
		      strawberry .setId("2");
		      shapeMap.put(strawberry .getId(),strawberry);
		      
		      Chocolate chocolate = new Chocolate();
		      chocolate .setId("3");
		      shapeMap.put(chocolate .getId(),chocolate);
		}	

}
