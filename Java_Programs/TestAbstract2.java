//2.Example of Abstract class.
abstract class Account{
  abstract void deposit();
  void withdrawl(){
  //method with body
  System.out.println("Withdrawl method");
  }
}
class Saving extends Account{
 void deposit(){
  System.out.println("Deposit method of Saving class.");
 }
}
class TestAbstract2{
 public static void main(String args[]){
 //Account a=new Account();
 Account act=null;//act is a reference variable of parent class(Account).
 act=new Saving();//calling child class object
 act.deposit();
 act.withdrawl();
 }
}

