//9.Java StringBuffer class method.(reverse()).Accepting values from the user.
import java.util.*;
public class StringBufferEx9{
  public static void main(String args[]){
  String str="";
  String str1="";
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter your FirstName :");
  String fn=scan.next();
  StringBuffer sb=new StringBuffer(fn);
  str=sb.toString();
  sb.reverse();
  str1=sb.toString();
  System.out.println("String is ="+str);
  System.out.println("String1 is ="+str1);
  if(str.equals(str1))
   System.out.println("Palindrome string");
  else
   System.out.println("Not a Palindrome String");
 }
}

