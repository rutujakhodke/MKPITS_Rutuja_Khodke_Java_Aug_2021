//11.wap to accept a salary of 10 persons using while loop and print totalsalry and average salary.
import java.util.*;
class SalaryOf10Person
{
 public static void main(String args[])
 {
  int i=1;
  float salary,totalsal=0,avgsal;
  while(i<=10)
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter a salary of employee :");
	  salary=s.nextFloat();
      totalsal=totalsal+salary;
      i++;

  }
  System.out.println("total salary of employee are :"+totalsal);
  avgsal=(float)totalsal/10.0f;
  System.out.println("average salary is ="+avgsal);
 }
}