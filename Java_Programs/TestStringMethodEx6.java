//8.Java String class method.(boolean contains(CharSequence s)).
import java.util.*;
public class TestStringMethodEx6{
  public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter a Email Address :");
  String s2=scan.next();
  boolean b1=s2.contains(".com");
   if(b1==true){
    System.out.println("Valid Email Address");
   }
   else{
    System.out.println("Invalid Email Address");
   }
 }
}
