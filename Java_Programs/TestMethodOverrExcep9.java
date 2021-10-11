//9.Example of Java Exception Handling with MethodOverriding.In case subclass overriden method declare parent exception.
import java.io.*;
class Parent{
 void msg() throws ArithmeticException {
  System.out.println("Msg method of Parent class");
 }
}
class child extends Parent{
 void msg() throws Exception {//declare parent exception
  System.out.println("Msg method of Child class");
 }
}
public class TestMethodOverrExcep9{
  public static void main(String args[]){
  Parent p=new Child();
     try{
        p.msg();//compile time error
  }catch(Exception ee){

  }
 }
}