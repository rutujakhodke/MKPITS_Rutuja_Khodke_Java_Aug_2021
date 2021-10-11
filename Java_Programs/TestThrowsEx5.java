//6.Example of Java Throws Keyword in Exception Handling.In case you declare the exception,if exception occurs ,an exception will be thrown at runtime because throws does not handle the exception.
import java.io.*;
class A{
 void method() throws IOException{
  throw new IOException("Device Error");
 }
}
public class TestThrowsEx5{
 public static void main(String args[]) throws IOException{//declare exception
 A a=new A();
 a.method();
 System.out.println("Normal flow of the program..");//run time error is occured
 }
}