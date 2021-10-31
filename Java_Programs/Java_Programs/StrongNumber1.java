//2.wap to accept a number from the user and check whether that no. is strong or not.
import java.util.*;
class StrongNumber1
{
public static void main(String args[])
{
	int num;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number :");
	num=s.nextInt();
	int originalnum=num;
	int rem;
	int fact=1,sum=0;
	while(num !=0)
	{
	 rem=num%10;//145%10=5 14%10=4 1%10=1
	 System.out.println("remainder is ="+rem);//5 4  1
	 num=num/10;//145/10=14 14/10=4
	 System.out.println("number is ="+num);//14 4 1 0
	 fact=factorial(rem);//calling the method factorial//120
	 sum=sum+fact;//0+120=120 120+24=144 144+1=145
	}
	if(originalnum==sum)
	{
		System.out.println(originalnum+ "is a strong number.");
	}
	else
	{
		System.out.println(originalnum+ "is not a strong number.");
	}
}
public static int factorial(int r)
{
	int f=1;
	while(r>0)//5>0 4>0 3>0 2>0 1>0
	{
		f=f*r;//1*5=5 1*4=4 1*3=3 2*1=2 1*1=1
		r--;//4 3 2 1 0
	}
	return f;//5 *4*3*2*1=120
}
}