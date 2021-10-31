//1.Java console Example.
import java.io.Console;
class ConsoleEx{
 public static void main(String args[]){
 Console c=System.console();//instance of console class
 System.out.println("Enter your Name :");
 String n=c.readLine();
 System.out.println("Welcome "+n);
 }
}