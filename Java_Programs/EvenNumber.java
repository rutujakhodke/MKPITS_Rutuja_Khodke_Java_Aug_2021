//8.wap to print even no. between 1 and 10.
import java.util.*;
class EvenNumber
{
 public static void main(String args[])
 {
	 int num,i=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter even numbers till :");
	num=s.nextInt();
	System.out.println("even numbers between from 1 to 10 are :");
    for(i=1;i<=num;i++)
    {
		if(i%2==0)
	{
	 System.out.println("even numbers are :"+i);
	}
	}
  }
}