//8.wap to accept a no. and print factorial of a number using do while loop.
import java.util.*;
class FactorialNo1
{
 public static void main(String args[])
 {
	 int num,fact=1;
	 int i=1;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a number :");
	  num=s.nextInt();
	 do
	 {
	  fact=fact*i;
	  i++;

	  }while(i<=num);
	   System.out.println("factorial of " + num + " is :"+fact);
 .
 }
}