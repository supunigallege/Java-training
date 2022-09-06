
public class BankCustomer implements Runnable{



    private BankAccount account;

    public BankCustomer(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i=1; i<=10; i++){

            withdraw(5000);

            if (account.getBalance()<0){
                System.out.println("cash isnt sufficiant");
            }

        }

    }

    private synchronized void withdraw(int amount){

       if (account.getBalance()>=amount){

           System.out.println(Thread.currentThread().getName()+" is trying to withdraw Rs "+amount);

           try {
               Thread.sleep(5000);
           }catch (InterruptedException exception){
               exception.printStackTrace();
           }

           account.setBalance(amount);
           System.out.println(Thread.currentThread().getName()+" Withdraw Rs "+amount +" , Remaining Balance Rs "+account.getBalance());

       }

       if (account.getBalance()<amount){

           System.out.println(Thread.currentThread().getName()+",cant perform this withdrawal due to insufficiant cash amount. Your available balance is Rs "+ account.getBalance());
       }

    }
}
