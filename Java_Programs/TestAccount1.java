//6.repeat a above account class program by accepting values from the user.
import java.util.*;
class Account{
 int acc_no;
 String name;
 float amount;

 void insert(int a,String n,float amt){
  acc_no=a;
  name=n;
  amount=amt;//we add a value in amt then it will assign to amount.
 }

 void deposit(float amt){
  amount=amount+amt;
  System.out.println(amt +" Amount is Deposited Successfully");
 }

 void withdraw(float amt){
  if(amount<amt){
   System.out.println("Withdrawl amount due to insufficient fund.");
  }
  else{
   amount=amount-amt;
   System.out.println(amt+ "Amount is withdrawl successfully.");
  }
 }

 void checkBalance(){
  System.out.println("Balance Amount is :"+amount);
 }

 void display(){
  System.out.println(acc_no+" "+name+" "+amount);
 }
}
class TestAccount1{
 public static void main(String args[]){
 Account a1=new Account();//craeting instance of a class account.
 Scanner s=new Scanner(System.in);
 System.out.println("Enter a Account Number :");
 int acc_no=s.nextInt();
 System.out.println("Enter a Account Holder Name :");
 String name=s.next();
 System.out.println("Enter a Amount.");
 float amount=s.nextFloat();

  a1.insert(acc_no,name,amount);
  a1.display();

  System.out.println("Enter amount to be Deposited in your account.");
  float amt=s.nextFloat();
  a1.deposit(amt);
  a1.checkBalance();

  System.out.println("Enter amount to be Withdrawl in your account.");
  amt=s.nextFloat();
  a1.withdraw(amt);
  a1.checkBalance();
 }
}
