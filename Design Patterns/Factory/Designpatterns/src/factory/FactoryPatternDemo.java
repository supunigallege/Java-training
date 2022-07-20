package factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IcecreamFactory icecreamFactory = new IcecreamFactory();

	      //get an object of Vanila and call its serve method.
	      Icecream icecream1 = icecreamFactory.geticecream("Vanila");

	      //call serve method of vanila
	      icecream1.serve();


	      //get an object of strawberry and call its serve method.
	     Icecream icecream3 = icecreamFactory.geticecream("STRAWBERRY");

	      //call serve method of strawberry
	     icecream3.serve();

	}

}