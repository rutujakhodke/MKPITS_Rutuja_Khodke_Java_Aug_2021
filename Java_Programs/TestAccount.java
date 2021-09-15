//5.wap of class account which has deposit and withdraw method.
class Account{
 int acc_no;
 String name;
 float amount;
 //method to intialize object.
 void insert(int a,String n,float amt){
  acc_no=a;
  name=n;
  amount=amt;
 }
 //deposit method
 void deposit(float amt){
  amount=amount+amt;
  System.out.println(amt+ "Amount Deposited.");
 }
 //withdraw method
 void withdraw(float amt){
  if(amount<amt){
   System.out.println("Insufficient Balance.");
  }else{
   amount=amount-amt;
   System.out.println(amt+ "Amount is Withdrawn.");
  }
 }
 //method to check the balance of the account.
 void checkBalance(){
 System.out.println("Balance is :"+amount);
 }
 //method to display the values of an object.
 void display(){
  System.out.println(acc_no+" "+name+" "+amount);
 }
}
//creating a test class to deposit and withdraw amount.
class TestAccount{
 public static void main(String args[]){
  Account a1=new Account();
  a1.insert(85634,"Ankit",1000);
  a1.display();
  a1.checkBalance();

  a1.deposit(4000);
  a1.checkBalance();

  a1.withdraw(2000);
  a1.checkBalance();

 }
}