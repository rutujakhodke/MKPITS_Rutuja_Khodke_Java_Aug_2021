//8.wap to accept a no. and print whether it is prime no. or not.
import java.util.*;
class ForPrimeNo
{
 public static void main(String args[])
 {
  int num,i;
  boolean flag=false;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a number :");
  num=s.nextInt();

  for(i=2;i<=num/2;i++)
  {
	 if(num%i==0)//condition for non prime.
	 {
		 flag=true;
		System.out.println(num+ "not a prime number.");
		break;
	 }
  }
	 if(!flag)

		 System.out.println(num+ "is an prime number.");
	 else
	     System.out.println(num+ "not a prime number.");
 }
}