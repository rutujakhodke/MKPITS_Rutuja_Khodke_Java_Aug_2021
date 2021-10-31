//11.wap to accept a no. and then print whether it is prime no.or not.
import java.util.*;
class PrimeNo
{
  public static void main(String args[])
  {
	  int num,i=2;
	  boolean flag= false;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number :");
	num=s.nextInt();

	while(i<=num/2)
	{
		//condition for non prime
		if(num%i==0)
		{
			flag =true;
			break;
		}
		i++;
	}
	if(!flag)
	 System.out.println(num+ "is a prime number.");
	 else
	 System.out.println(num+ "is not a prime number.");
	}
}