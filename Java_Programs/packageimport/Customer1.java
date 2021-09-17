//now create another class named customer.java in bank package.
package bank;
import sbi.Account;

class Customer1{
 public static void main(String args[]){
 Account act=new Account();
String str=act.deposit(200);
System.out.println(str);
 }
}