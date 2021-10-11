//7.Example of Java Exception Handling with MethodOverriding.If the superclass method declares an exception,subclass overriden method can declare subclass exception.
import java.io.*;
class Animal{
  void eat() throws Exception {//declare parent exception
   System.out.println("Animal eating..");
  }-
}
class Dog extends Animal{
 void eat() throws IOException {//declare subclass exception
   System.out.println("Dog eating..");
 }
}
public class TestMethodOverrExcep7{
  public static void main(String args[]){
     try{
        Animal a=new Dog();
        a.eat();
   }catch(Exception ee){
     System.out.println("Exception Handled..");
   }
  System.out.println("Normal flow of the program");
 }
}
