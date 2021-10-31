//4.Example of abstract class that has an abstract method.create a class account,saving and current.
abstract class Account{
 int accNo;
 int bal=1000;

 abstract String deposit(int accNo,int amount);//method without body

 String withdrawl(int accNo,int amount){
  this.accNo=accNo;
   if(amount>bal){
    return "Insufficient fund.";
   }
   else{
    bal=bal-amount;
    return "Amount withdrawl for account number " +accNo+ ",bal is:" +bal;
   }
 }
}
class Saving extends Account{
 int interest=200;
 String deposit(int accNo,int amount){
  this.accNo=accNo;
  bal=bal+amount+interest;
  return "Amount deposited for account number " +accNo+ ",bal is :"+bal;
 }
}
class Current extends Account{
 String deposit(int accNo,int amount){
  this.accNo=accNo;
  bal=bal+amount;
  return "Amount deposited for account Number " +accNo+ ",bal is :"+bal;
 }
}
class TestAbstract4{
public static void main(String args[]){
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a Account Number :");
int accNo=scan.nextInt();
System.out.println("Enter a Amount :");
int amount=scan.nextInt();
System.out.println("Enter a Saving or Current Account Type :");
String acttype=scan.next();
System.out.println("Do you want to Deposit or Withhdrawl :");
String ans=scan.next();

Account a=null;//a is reference variable of parent class (Account).

 if(acttype.equals("Saving")){
  a=new Saving();
 }
 else if(acttype.equals("Current")){
  a=new Current();
 }
 else{
  System.out.println("Invalid Account Type.");
  }

 if(ans.equals("Deposit")){
 String str=a.deposit(accNo,amount);
 System.out.println(str);
 }
 else if(ans.equals("Withdrawl")){
  String str=a.withdrawl(accNo,amount);
 System.out.println(str);
  }
 }
}