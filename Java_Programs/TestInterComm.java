class Customer{
    int amt=10000;
   synchronized void withdraw(int amt){
        System.out.println("Going to withdraw..");

    if(this.amt<amt){
        System.out.println("Less Balance,waiting for Deposit..");
        try{
            wait();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    this.amt-=amt;
        System.out.println("Withdraw is completed..");
    }
    synchronized void deposit(int amt){
        System.out.println("Going to deposit..");
        this.amt+=amt;
        System.out.println("Deposit completed..");
        notify();
    }
}
public class TestInterComm {
    public static void main(String[] args){
        Customer c=new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
        }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();


    }
}
