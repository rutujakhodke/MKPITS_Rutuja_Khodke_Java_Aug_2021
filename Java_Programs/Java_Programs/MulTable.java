//9.wap to accept a no. and print table of that no.
import java.util.*;
class MulTable
{
public static void main(String args[])
{
   int num,result=0;
   int i=1;
   Scanner s=new Scanner(System.in);
   System.out.println("enter a number :");
   num=s.nextInt();
   System.out.println("table of "+num+" is :");
   while(i<=10)
   {
	   result=num*i;
	   System.out.println(num+ " * " +i+ " = " +result);

	   i=i+1;
   }
 }
}