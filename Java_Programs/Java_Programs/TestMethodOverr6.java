//7.create a class account having field account number,balance and method deposit and withdrawl.
//create a subclass saving inherited from account and override the deposit (with interest) and withdrawl method.
//create a subclass current inherited from account and override the deposit(without interest) and withdrawl method.
class Account{
 int accNo;
 int bal=1000;

 String deposit(int accNo,int amount){
  return "Deposit method of Account class";
 }
 String withdrawl(int accNo,int amount){
   this.accNo=accNo;
   if(amount>bal){
    return "Insufficient fund";
   }
   {
    bal=bal-amount;
    return "Amount withdrawl for Account number " + accNo + " ,bal is :"+ bal;
   }
 }
}
class Saving extends Account{
 int interest=500;
  String deposit(int accNo,int amount){
  this.accNo=accNo;
   bal=bal+amount+interest;
   return "Amount deposited for Account number " + accNo + ",bal is "+ bal;
  }
}
class Current extends Account{
 String deposit(int accNo,int amount){
 this.accNo=accNo;
  bal=bal+amount;
  return "Amount deposited for Account number " + accNo + " ,bal is "+ bal;
 }
}
class TestMethodOverr6{
public static void main(String args[]){
java.util.Scanner scan =new java.util.Scanner(System.in);
System.out.println("Enter a Account Number :");
int accNo=scan.nextInt();
System.out.println("Enter a Amount :");
int amount=scan.nextInt();
System.out.println("Enter a Saving or Current Account type :");
String acttype=scan.next();
System.out.println("Do you want to deposit or withdrawl amount :");
String ans=scan.next();

Saving sav=null;
Current cur=null;
String str;

if(acttype.equals("Saving")){
   sav=new Saving();
  if(ans.equals("deposit")){
  str=sav.deposit(accNo,amount);
  System.out.println(str);
  }
  else if(ans.equals("withdrawl")){
   str=sav.withdrawl(accNo,amount);
   System.out.println(str);
  }
}
if(acttype.equals("Current")){
  cur=new Current();
 if(ans.equals("deposit")){
 str=cur.deposit(accNo,amount);
 System.out.println(str);
 }
 else if(ans.equals("withdrawl")){
 str=cur.withdrawl(accNo,amount);
 System.out.println(str);
  }
 }
}
}