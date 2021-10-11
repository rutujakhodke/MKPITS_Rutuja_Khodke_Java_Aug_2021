//4.Example of Java Throws Keyword in Exception Handling.In case you handle the exception the code will be executed fine whether exception occurs during the program or not.
import java.io.*;
class M{
 void method() throws IOException{
   throw new IOException("Memory of Device is full..");
 }
}
public class TestThrowsEx3{
 public static void main(String args[]){
   try{
      M m=new M();
      m.method();
 }catch(Exception e){
    System.out.println("Exception Handled..");
 }
 System.out.println("Normal flow of the program..");
 }
}