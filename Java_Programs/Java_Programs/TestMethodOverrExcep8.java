//8.Example of Java Exception Handling with MethodOverriding.If the superclass method declares an exception,subclass overriden method can not declare parent exception.
import java.io.*;
class Account{
 void deposit(int amount) throws IOException {
  System.out.println("Deposit method of Account class");
 }
}
class Saving extends Account{
 void deposit(int amount) throws Exception{//declare parent exception
  System.out.println("Deposit method of Saving class");
 }
}
public class TestMethodOverrExcep8{
  public static void main(String args[]){
       try{
          Saving s=new Saving();
          s.deposit(500);
    }catch(Exception ee){
     System.out.println(ee);//compile time error
   }
  System.out.println("Normal flow of the program");
 }
}
