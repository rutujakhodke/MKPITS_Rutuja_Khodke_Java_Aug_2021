//6.Example of Java Exception Handling with MethodOverriding.If the superclass method declares an exception,subclass overriden method not declare exception.
import java.io.*;
class Animal{
 void eat() throws IOException {//declare parent class exception
  System.out.println("Animal eating..");
 }
}
class Dog extends Animal{
 void eat(){//not declare exception
  System.out.println("Dog eating..");
 }
}
public class TestMethodOverrExcep6{
  public static void main(String args[]){
     try{
        Animal a=new Dog();//a is a reference variable of Parent class
        a.eat();
   }catch(Exception ee){
      System.out.println(ee.toString());
   }
   System.out.println("Normal flow of the program");
 }
}
