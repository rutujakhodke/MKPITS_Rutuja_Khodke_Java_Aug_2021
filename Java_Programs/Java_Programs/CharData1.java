//1.example on char datatype.
import java.util.*;
class CharData1
{
 public static void main(String args[])
 {
  char b1='A';
  System.out.println("char value "+b1);
  Scanner s=new Scanner(System.in);
  System.out.println("enter a character :");
  b1=s.next().charAt(0);
  System.out.println("char value "+b1);
 }
}