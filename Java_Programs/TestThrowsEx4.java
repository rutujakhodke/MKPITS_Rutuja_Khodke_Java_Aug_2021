//5.Example of Java Throws Keyword in Exception Handling.In case you declare the exception ,if exception does not occur,the code will be executed fine.
import java.io.*;
class N{
 void method() throws IOException {
   System.out.println("Device operation performed..");
 }
}
public class TestThrowsEx4{
 public static void main(String args[]) throws IOException{//declare exception
 N n=new N();
 n.method();
 System.out.println("Normal flow of the program..");
 }
}
