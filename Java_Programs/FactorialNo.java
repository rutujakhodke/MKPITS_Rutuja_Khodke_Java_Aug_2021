//8.wap to accept a number and print factorial of that number.
import java.util.*;
class FactorialNo
{
 public static void main(String args[])
 {
	 int num,fact=1;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a number :");
	 num=s.nextInt();

	 while(num>0)
	 {
		 fact=fact*num;
		 num=num-1;
	 }
	 System.out.println("factorial of a number is :"+fact);
 }
}