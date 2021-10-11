//5.Example of Java Exception Handling with MethodOverriding.If the superclass method declares an exception,subclass overriden method can declare superclass parent exception.
import java.io.*;
class Account{
 void deposit(int amount) throws IOException{//declare parent class exception
   System.out.println("Deposit method of Account class");
 }
}
class Current extends Account{
 void deposit(int amount) throws IOException {//declare child class exception is same as parent class exception
  System.out.println("Deposit method of Current class");
 }
}
public class TestMethodOverrExcep5{
  public static void main(String args[]){
    try{
  Current c=new Current();
  c.deposit(100);
}catch(Exception ee){
  System.out.println(ee);
}
System.out.println("Normal flow of the program");
 }
}