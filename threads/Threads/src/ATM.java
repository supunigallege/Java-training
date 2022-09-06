
public class ATM {
	 public static void main(String[] args) {
	BankAccount account=new BankAccount();
	BankCustomer customer=new BankCustomer(account);
	Thread withdrawer1=new Thread(customer);
	Thread withdrawer2=new Thread(customer);
	
	withdrawer1.setName("Mother-Kanthi");
	withdrawer2.setName("Daughter-Shehani");

	withdrawer1.start();
	withdrawer2.start();
 }
}
