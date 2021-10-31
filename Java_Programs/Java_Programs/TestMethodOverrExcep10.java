//10.Example of Java Exception Handling with MethodOverriding.In case subclass overriden method declares same exception.
import java.io.*;
class Parent{
 void msg() throws Exception {//declare parent class exception
  System.out.println("Msg method of Parent class");
 }
}
class Child extends Parent{
 void msg() throws Exception {//declare child class exception is same as parent class exception
   System.out.println("Msg method of Child class");
 }
}
public class TestMethodOverrExcep10{
 public static void main(String args[]){
 Parent p=new Child();
   try{
      p.msg();
  }catch(Exception ee){

  }
 }
}