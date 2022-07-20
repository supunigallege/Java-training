package singleton;




public class SinglePersonInstanceObject {
	
	//Create an Object
	private static volatile SinglePersonInstanceObject singlePersonInstanceObject; 
	
	
	private SinglePersonInstanceObject() {
		if (singlePersonInstanceObject !=  null) {
			throw new RuntimeException("Please use getsinglePersonInstanceObject method"); 
		}	
	}

	
	public static SinglePersonInstanceObject getsinglePersonInstanceObject() {
		
		if(singlePersonInstanceObject==null) {
			
			synchronized (SinglePersonInstanceObject.class) {
				
				if(singlePersonInstanceObject==null) {
					singlePersonInstanceObject = new SinglePersonInstanceObject();
				}
			}
			
		}
		return singlePersonInstanceObject;
	}
	
	
}
