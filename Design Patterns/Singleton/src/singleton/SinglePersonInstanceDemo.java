package singleton;

public class SinglePersonInstanceDemo {
public static void main(String[] args) {
		
		Long start;
		Long end;
		
		//1st Instance
		SinglePersonInstanceObject singlePersonInstanceObject1 = SinglePersonInstanceObject.getsinglePersonInstanceObject();
		System.out.println(singlePersonInstanceObject1);
		
		start = System.currentTimeMillis();
	
		end = System.currentTimeMillis();
		
		System.out.println(end-start);
		//2nd Instance
		SinglePersonInstanceObject singlePersonInstanceObject2 = SinglePersonInstanceObject.getsinglePersonInstanceObject();
		System.out.println(singlePersonInstanceObject2);
		
	}


}
