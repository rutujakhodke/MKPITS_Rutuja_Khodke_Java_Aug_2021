//10.wap to accept a number and print from 1 to the no. entered by the user.
import java.util.*;
class Number1
{
 public static void main(String args[])
 {
	 int num;
	 int i=1;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a number :");
	 num=s.nextInt();

	 while(i<=num)
	 {
		 System.out.println("number ="+i);
		 i=i+1;
	 }
 }
}