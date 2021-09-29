//1.Example of Abstract class.
abstract class Account{
 abstract void deposit();//method without body(abstract method)
 void withdrawl(){//method with body(non abstact method)

 }
}
class TestAbstract1{
public static void main(String args[]){
 Account a=new Account();//error since you cannot create a instance of a abstract class
 }
}