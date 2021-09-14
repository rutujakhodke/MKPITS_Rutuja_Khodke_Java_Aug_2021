//7.wap to accept a no. and print table of that no. using for loop.
import java.util.*;
class ForTable
{
 public static void main(String args[])
 {
  int num,i;
  int result=0;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a number :");
  num=s.nextInt();
  System.out.println("table of "+num+" is :");

  for(i=1;i<=10;i++)
  {
	  result=num*i;
	  System.out.println(num+ " * " +i+ " = " +result);
  }
 }
}