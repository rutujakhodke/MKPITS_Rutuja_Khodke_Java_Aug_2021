//1.wap to print a no. whether it is strong no. or not.
import java.util.*;
class StrongNumber
{
public static void main(String args[])
{
	int num=145;
	int originalnum=num;//145
	int rem;
	int fact;
	int sum=0;
	while(num !=0)
	{
	 rem=num%10;
	 System.out.println("remainder is :"+rem);
	 num=num/10;
	 System.out.println("num is :"+num);
	 fact=factorial(rem);//passing rem to function to calculate factorial.
	 sum=sum+fact;
	}
	if(originalnum==sum)
	{
		System.out.println(num+ "is an strong number.");
	}
	else
	{
		System.out.println(num+ "is not an strong number.");
	}
 }
 //creating a function fact to calculate factorial of a number.
 int factorial(int r)
 {
	 int f=1;
	 while(r>0)
	 {
		 f=f*r;
		 r=r-1;
	 }
	 return f;
	 }
 }
}
