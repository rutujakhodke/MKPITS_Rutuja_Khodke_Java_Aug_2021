//4.Exception Handling with MethodOverriding in java.If the Superclass method does not declare an exception,
//Subclass overriden method cannot declare the checked exception but can declare unchecked Exception.
import java.io.*;
class Parent{
 void msg(){
  System.out.println("Msg method of Parent class");
 }
}
class Child1 extends Parent{
 void msg() throws ArithmeticException {
  System.out.println("Msg method of Child1 class");
 }
}
public class TestMethodOverrExcep4{
  public static void main(String args[]){
  Parent p=new Child1();
  p.msg();
 }
}
