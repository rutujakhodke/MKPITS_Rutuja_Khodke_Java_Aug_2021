//13.(example of hierarchical inheritance).create a parent class Account having fields accno,balance.create a class Saving inherited from Account class having deposit() method.
//create a class Current inherited from Account class having deposit() method without interest.
class Account{
 int accNo;
 int balance;

 void insertAccountData(int accNo,int balance){
  this.accNo=accNo;
  this.balance=balance;
 }
 void showBalance(){
 System.out.println("Balance for account Number " +accNo+ " is " +balance);
 }
}
class Saving extends Account{
 int amount;
 int interest;

void deposit(int amount){
 interest=500;
 balance=balance+amount+interest;
 System.out.println("Amount deposited Successfully in Saving Account.");
 }
}
class Current extends Account{
void deposit(int amount){
 balance=balance+amount;
 System.out.println("Amount deposited Successfully in Current Account.");
 }
}
class TestInheritance11{
public static void main(String args[]){
Current c1=new Current();
c1.insertAccountData(74398,1000);
c1.deposit(500);
c1.showBalance();

Saving s1=new Saving();
s1.insertAccountData(30987,2000);
s1.deposit(200);
s1.showBalance();
 }
}