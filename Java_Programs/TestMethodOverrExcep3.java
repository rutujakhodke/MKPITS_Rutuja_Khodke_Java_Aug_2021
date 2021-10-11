//3.Exception Handling with MethodOverriding in java.If the Superclass method does not declare an exception,
//Subclass overriden method cannot declare the checked exception but can declare unchecked Exception.
import java.io.*;
class Account{
 void deposit(int amount){
  System.out.println("Deposit method of Account class");
 }
}
class Saving extends Account{
 void deposit(int amount) throws ArithmeticException{
  System.out.println("Deposit method of Saving class");
 }
}
public class TestMethodOverrExcep3{
  public static void main(String args[]){
  Saving s=new Saving();
  s.deposit(500);
 }
}