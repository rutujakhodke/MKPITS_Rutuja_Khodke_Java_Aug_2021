//7.wap to accept empname,basic_salary and designation and then calculate bonus using switch statement.
import java.util.*;
class Employee1
{
 public static void main(String args[])
 {
	 String empname,designation;
	 int basic_salary;
	 int bonus=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a employee name :");
	 empname=s.next();
	 System.out.println("Enter a employee designation :");
	 designation=s.next();
	 System.out.println("enter a basis salary of employee :");
	 basic_salary=s.nextInt();

	 switch(designation)
	 {
		 case "manager":
		 bonus=1200;
		 break;
		 case "clerk":
		 bonus=500;
		 break;
		 case "peon":
		 bonus=100;
		 break;
		 default:
		 System.out.println("invalid designation.");
		 break;
	 }
	 System.out.println("employee name :"+empname);
	 System.out.println("employee designation :"+designation);
	 System.out.println("basic salary of employee :"+basic_salary);
	 System.out.println("employee bonus :"+bonus);

	 }
}