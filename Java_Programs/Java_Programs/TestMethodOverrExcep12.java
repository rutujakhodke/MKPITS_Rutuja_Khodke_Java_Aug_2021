//12.Example of Java Exception Handling with MethodOverriding.In case subclass overriden method declares no exception.
import java.io.*;
class Parent{
 void msg() throws Exception {//declare parent class exception
  System.out.println("Msg method of Parent class");
 }
}
class Child extends Parent{//not declare exception
 void msg(){
  System.out.println("Msg method of Child class ");
 }
}
public class TestMethodOverrExcep12{
  public static void main(String args[]){
  Parent p=new Child();
     try{
         p.msg();
    }catch(Exception ee){

   }
 }
}