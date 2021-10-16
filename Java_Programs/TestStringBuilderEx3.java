//3.Java StringBuilder class method example.(insert(int index,String s)).Accept the values from user.
import java.util.*;
public class TestStringBuilderEx3{
 public static void main(String args[]){
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter your FirstName :");
 String fn=scan.next();
 StringBuilder sb=new StringBuilder(fn);
 System.out.println("Enter your LastName :");
 String ln=scan.next();
 sb.insert(3,ln);
 System.out.println("Fullname is ="+sb);
 }
}

