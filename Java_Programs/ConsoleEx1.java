//2.Java console example to read password.
import java.io.Console;
class ConsoleEx1{
 public static void main(String args[]){
 Console c=System.console();
 System.out.println("Enter your Name :");
 String n=c.readLine();
 System.out.println("Enter a Password :");
 char[] ch=c.readPassword();
 String pass=String.valueOf(ch);//converting char array into string
 System.out.println("Name is :"+n);
 System.out.println("Password is :"+pass);
 }
}