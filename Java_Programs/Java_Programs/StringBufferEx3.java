//3.Java StringBuffer class method.(insert()).Accepting values from user.
import java.util.*;
public class StringBufferEx3{
 public static void main(String args[]){
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter Your First Name :");
 String fn=scan.next();
 StringBuffer sb=new StringBuffer(fn);
 System.out.println("Enter Your Last Name :");
 String ln=scan.next();
 sb.insert(5,ln);
 System.out.println(sb);
 }
}

