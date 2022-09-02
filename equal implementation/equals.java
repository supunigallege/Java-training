
public class employee {
	public String id;
	 public String code;
	 public String nic;
	 public String address;

	/*employee(String id,String code,String nic,String address)
	{
	id=this.id;
	code=this.code;
	nic=this.nic;
	address=this.address;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*employee e1=new employee("001","abc-001","977780657V","no 72,colombo road,malabe");
		employee e2=new employee("001","abc-001","977780657V","no 72,colombo road,malabe");
		employee e3=new employee("002","def-002","978674194V","no 85,colombo road,ratmalana");
		employee e4=new employee("002","def-002","978674194V","no 85,colombo road,ratmalana");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e3));
		System.out.println(bb.equals(aa));*/
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
		e1.id="001";
		e1.code="abc-001";
		e1.nic="977780657V";
		e1.address="no 72,colombo road,malabe";
		
		e2.id="001";
		e2.code="abc-001";
		e2.nic="977780657V";
		e2.address="no 72,colombo road,malabe";
		
		e3.id="002";
		e3.code="def-002";
		e3.nic="978674194V";
		e3.address="no 85,colombo road,ratmalana";
		
		if(e1.id.equals(e2.id)&&e1.code.equals(e2.code)&&e1.nic.equals(e2.nic)&&e1.address.equals(e2.address))
		{
			System.out.println("e1 and e2 objects are equal");
		}
		else
		{
			System.out.println("e1 and e2 objects not equal");
		}
		
		if(e1.id.equals(e3.id)&&e1.code.equals(e3.code)&&e1.nic.equals(e3.nic)&&e1.address.equals(e3.address))
		{
			System.out.println("e1 and e3 objects are equal");
		}
		else
		{
			System.out.println("e1 and e3 objects are not equal");
		}
		
		

	}
}
