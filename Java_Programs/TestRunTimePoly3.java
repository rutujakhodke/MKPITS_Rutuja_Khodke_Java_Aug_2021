//3.Example of runtime polymorphism using account ,saving and current class.
class Account{
 int accNo;
 int bal=1000;

 String deposit(int accNo,int amount){
  return "Deposit method of Account class.";
 }
 String withdrawl(int accNo,int amount){
  this.accNo=accNo;
  if(amount>bal){
   return "Insufficient Fund.";
  }
  else{
   bal=bal+amount;
   return "Amount withdrawl for Account number " +accNo+ ",bal is :"+bal;
  }
 }
}
class Saving extends Account{
 int interest=300;
 String deposit(int accNo,int amount){
  this.accNo=accNo;
  bal=bal+amount+interest;
  return "Amount Deposited for Account number " +accNo+ ",bal is :"+bal;
 }
}
class Current extends Account{
 String deposit(int accNo,int amount){
  this.accNo=accNo;
  bal=bal+amount;
  return "Amount Deposited for Account number " +accNo+ ",bal is : "+bal;
 }
}
class TestRunTimePoly3{
public static void main(String args[]){
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter a Account Number :");
int accNo=s.nextInt();
System.out.println("Enter a Amount :");
int amount=s.nextInt();
System.out.println("Enter a Saving or Current Account type :");
String acttype=s.next();
System.out.println("Do you want to Deposit or Withdrawl the Amount :");
String ans=s.next();

Account act=null;//act is a reference variable of parent (Account) classn

 if(acttype.equals("Saving")){
  act=new Saving();
 }
 else if(acttype.equals("Current")){
  act=new Current();
 }
 else{
  System.out.println("Invalid Account type");
 }

 if(ans.equals("deposit")){
  String str=act.deposit(accNo,amount);
  System.out.println(str);
 }
 else if(ans.equals("Withdrawl")){
  String str=act.withdrawl(accNo,amount);
  System.out.println(str);
  }
 }
}