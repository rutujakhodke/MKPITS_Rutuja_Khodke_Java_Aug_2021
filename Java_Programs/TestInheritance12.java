//14.(example of hierarchical inheritance).create a parent class Account having fields accno,balance.create a class Saving inherited from Account class having deposit() method.
//create a class Current inherited from Account class having deposit() method without interest.(repeat the program by accepting values from the user).
class Account{
 int accno;
 int balance;

 void insertAccountData(int accno,int balance){
  this.accno=accno;
  this.balance=balance;
  }
 void showBalance(){
  System.out.println("Balance for Account Number "+accno+" is "+balance);
 }
}
class Saving extends Account{
 int amount;
 int interest;

 void deposit(int amount){
  interest=200;
  balance=balance+amount+interest;
  System.out.println("Amount deposited Successfully in Saving Account.");
 }
}
class Current extends Account{
 int amount;
void deposit(int amount){
balance=balance+amount;
System.out.println("Amount Deposited Successfully in Current Account.");
 }
}
class TestInheritance12{
public static void main(String args[]){
Saving s=new Saving();
java.util.Scanner scan=new java.util.Scanner(System.in);

System.out.println("----Enter Details For Saving Account----");
System.out.println("Enter a Person Account Number :");
int accno=scan.nextInt();
System.out.println("Enter a Person Account Balance :");
int balance=scan.nextInt();
s.insertAccountData(accno,balance);
System.out.println("Enter a Amount to be deposited by a Person.");
int amount=scan.nextInt();
s.deposit(amount);
s.showBalance();
System.out.println("------------------------");

Current c=new Current();
System.out.println("----Enter Details for Current Account----");
System.out.println("Enter a Person Account Number :");
accno=scan.nextInt();
System.out.println("Enter a Person Account Balance :");
balance=scan.nextInt();
c.insertAccountData(accno,balance);
System.out.println("Enter a Amount to be Deposited by a Person");
amount=scan.nextInt();
c.deposit(amount);
c.showBalance();
 }
}
