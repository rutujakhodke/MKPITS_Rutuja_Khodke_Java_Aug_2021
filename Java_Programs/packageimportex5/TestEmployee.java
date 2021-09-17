//create a class TestEmployee to use the class Employee created in mkpits1 package.
import mkpits1.Employee;
import java.util.*;
class TestEmployee{
 public static void main(String args[]){
 Employee e1=new Employee();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a Employee Number :");
 int empNo=sc.nextInt();
 System.out.println("Enter a Employee Name :");
 String empName=sc.next();
 System.out.println("Enter a Employee Basic salary :");
 int basicSalary=sc.nextInt();
 
 e1.insert(empNo,empName,basicSalary);
 e1.calculateBonus();
 e1.display();
 
 }
}