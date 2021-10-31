//2.Exception Handling with MethodOverriding in java.If the Superclass method does not declare an exception,
//Subclass overriden method cannot declare the checked exception.
import java.io.*;
class Parent{
 void msg(){
  System.out.println("Msg method of Parent class");
 }
}
class child extends Parent{
 void msg() throws IOException{
  System.out.println("Msg method of child class");
 }
}
public class TestMethodOverrExcep2{
  public static void main(String args[]){
  Parent p=new Child();
  p.msg();//compile time error
 }
}