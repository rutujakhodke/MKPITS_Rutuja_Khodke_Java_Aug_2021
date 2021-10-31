//6.create a class account having fields accno,bal and method deposit and withdrawl.create a subclass saving and override
//the deposit and withdrawl method.(taking interest also).
class Account{
 int accNo;
 int bal=1000;

 String deposit(int accNo,int amount){
  return "Deposit method of Account class.";
 }
 String withdrawl(int accNo,int amount){
  return "Withdrwal method of Account class.";
 }
}
class Saving extends Account{
	int interest=500;
 String deposit(int accNo,int amount){
   this.accNo=accNo;
  bal=bal+amount+interest;
  return "Amount deposited for account number " +accNo+ ",bal is " +bal;
 }
 String withdrawl(int accNo,int amount){
  this.accNo=accNo;
  if(amount>bal){
   return "Insufficient fund .";
   }
   else{
   bal=bal-amount;
   return "Amount withdrawl for account number " +accNo+ ",bal is "+bal;
   }
 }
}
class TestMethodOverr5{
public static void main(String args[]){
java.util.Scanner scan =new java.util.Scanner(System.in);
System.out.println("Enter a Account Number :");
int accNo=scan.nextInt();
System.out.println("Enter a Amount :");
int amount=scan.nextInt();
System.out.println("Do you want to deposit or withdrawl ");
String ans=scan.next();

Saving s=new Saving();
String str;
if(ans.equals("deposit")){
str=s.deposit(accNo,amount);
System.out.println(str);
}
else if(ans.equals("withdrawl")){
str=s.withdrawl(accNo,amount);
System.out.println(str);
  }
 }
}
