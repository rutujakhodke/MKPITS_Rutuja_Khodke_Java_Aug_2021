//11.wap to accept a number and print fibonacci series.
import java.util.*;
class FibonacciNo
{
 public static void main(String args[])
 {
	 int n1=0,n2=1,n3,i,number;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the number of elements :");
	 number=s.nextInt();
	 System.out.println(n1+ ", ");
	 for(i=2;i<number;i++)
	 {
		n3=n1+n2;
		System.out.println("fibonacci series :"+n3);
		n1=n2;
		n2=n3;
	 }
 }
}