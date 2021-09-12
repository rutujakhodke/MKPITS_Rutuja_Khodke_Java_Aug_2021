//9.wap to print odd no. between 1 and 10.
import java.util.*;
class OddNumber
{
 public static void main(String args[])
 {
	 int num,i=1;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a odd numbers till :");
	 num=s.nextInt();
	 System.out.println("odd numbers from 1 to 10 are :");
	 for(i=1;i<=num;i++)
	 {
		 if(i%2==1)
		 {
			 System.out.println("odd numbers are :"+i);
		 }
	 }
  }
}