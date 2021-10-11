//11.Example of Java Exception Handling with MethodOverriding.In case subclass overriden method declares subclass exception.
import java.io.*;
class Parent{
 void msg() throws Exception {//declare parent exception
  System.out.println("Msg method of Parent class");
 }
}
class Child extends Parent{
 void msg() throws ArithmeticException {//declare subclass exception
  System.out.println("Msg method of Child class");
 }
}
public class TestMethodOverrExcep11{
  public static void main(String args[]){
  Parent p=new Child();
     try{
        p.msg();
   }catch(Exception ee){
   
   }
 }
}