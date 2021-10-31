//3.wap to accept empno.empname and salary and then print hra,da and totalsalary.
import java.util.*;
class Employee
{
 public static void main(String[] args)
 {
	 int empno;
	 String empname;
	 float salary;
	 float hra,da,totalsalary;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a employee number :");
	 empno=s.nextInt();
	 System.out.println("enter a employee name :");
	 empname=s.next();
	 System.out.println("enter a employee salary :");
	 salary=s.nextFloat();
	 hra=(float)(salary*0.20f);
	 da=(float)(salary*0.10f);
	 totalsalary=hra+da+salary;

	 System.out.println("hra :"+hra);
	 System.out.println("da :"+da);
	 System.out.println("totalsalary ="+totalsalary);
  }
}