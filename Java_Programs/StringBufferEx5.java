//5.Java StringBuffer class method.(replace()).Accepting values from the user.
import java.util.*;
public class StringBufferEx5{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter your FirstName :");
  String fn=s.next();
  StringBuffer sb=new StringBuffer(fn);
  System.out.println("Enter your LastName :");
  String ln=s.next();
  sb.replace(1,5,ln);
  System.out.println(sb);
 }
}

