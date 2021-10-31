//5.Example of abstract class that has an two abstract method.create a class account,saving and current.
abstract class Account{
 int accNo;
 float balance=1000;
 String str="";

 abstract void deposit(float amount);//method without body
 abstract void withdrawl(float amount);

 String showBalance(){
  str="Account Number " +accNo+ " balance is :"+balance;
   return str;
 }
}
class Saving extends Account{
 int interest=200;
 void deposit(float amount){//overriding the Account class deposit method.
  balance=balance+amount+interest;
 }
 void withdrawl(float amount){//overriding the Account class withdrawl method.
  balance=balance-amount;
 }
}
class Current extends Account{
 void deposit(float amount){
  balance=balance+amount;
 }
 void withdrawl(float amount){
  balance=balance-amount;
 }
}
class TestAbstract5{
public static void main(String args[]){
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a Account Number :");
int actNo=scan.nextInt();
System.out.println("Enter a Amount :");
float amount=scan.nextFloat();
System.out.println("Enter a Saving or Current Account Type :");
String acttype=scan.next();
System.out.println("Do you want to Deposit or Withdrawl :");
String ans=scan.next();
String result="";

Account act=null;//create a reference of Account class.
  if(acttype.equals("Saving")){
  act=new Saving();
  act.accNo=actNo;
   if(ans.equals("Deposit")){
    act.deposit(amount);
    }
   else if(ans.equals("Withdrawl")){
   act.withdrawl(amount);
   }
   result=act.showBalance();
 }
 else if(acttype.equals("Current")){
  act=new Current();
  act.accNo=actNo;
   if(ans.equals("Deposit")){
    act.deposit(amount);
   }
   else if(ans.equals("Withdrawl")){
    act.withdrawl(amount);
   }
   result=act.showBalance();
  }
  else{
  System.out.println("Invalid Inputs");
  }
  System.out.println(result);
  }
 }

