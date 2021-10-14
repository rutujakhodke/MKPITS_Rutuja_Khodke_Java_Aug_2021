//7.Java StringBuffer class method.(delete()).Accepting values from the user.
import java.util.*;
public class StringBufferEx7{
  public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter Your Name :");
  String n=scan.next();
  StringBuffer sb=new StringBuffer(n);
  sb.delete(2,5);
  System.out.println(sb);
 }
}