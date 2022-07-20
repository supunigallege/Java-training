
public class Application {
	public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Milkshakebucket milkshakebucket = new Milkshakebucket();

        milkshakebucket.addLayer(new Layer("Icecream"));

        milkshakebucket.addLayer(new Layer("Jelly"));
        /*careTaker.save(milkshakebucket);
        System.out.println(milkshakebucket);*/

        milkshakebucket.addLayer(new Layer("Peanuts"));
        /*careTaker.save(milkshakebucket);
        System.out.println(milkshakebucket);
*/
        milkshakebucket.addLayer(new Layer("Strawberry"));
       /* careTaker.save(milkshakebucket);
        System.out.println(milkshakebucket);*/

        milkshakebucket.addLayer(new Layer("Chocolate sauce"));
        /*careTaker.save(milkshakebucket);
        System.out.println(milkshakebucket);
*/
      
    }
}
