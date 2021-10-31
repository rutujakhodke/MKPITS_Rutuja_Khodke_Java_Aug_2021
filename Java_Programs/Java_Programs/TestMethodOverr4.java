//6.create a class account having fields accno,bal and method deposit and withdrawl.create a subclass saving and override the deposit and withdrawl method.
class Account{
 int accNo;
 int balance=1000;

 void deposit(int amount){
  System.out.println("Deposit method of Account class.");
 }
 void withdrawl(int amount){
  System.out.println("Withdrawl method of Account class.");
 }
}
class Saving extends Account{
 void deposit(int amount){
  balance=balance+amount;
  System.out.println("Deposit method of Saving class,Balance is ="+balance);
 }
 void withdrawl(int amount){
  balance=balance-amount;
  System.out.println("Withdrawl method of Saving class,Balance is ="+balance);
 }
}
class TestMethodOverr4{
public static void main(String args[]){
Account a=new Account();
a.accNo=34672;
a.deposit(200);
a.withdrawl(100);
Saving s=new Saving();
s.accNo=49532;
s.deposit(500);
s.withdrawl(300);
 }
}