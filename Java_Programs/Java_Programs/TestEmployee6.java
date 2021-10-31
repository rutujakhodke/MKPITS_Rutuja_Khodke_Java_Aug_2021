//7.example of default and parameterized constructor.
import java.util.*;
class Employee{
 int empno;
 String name;
 //creating default constructor
 public Employee(){
  System.out.println("Default constructor is called.");
  Scanner s=new Scanner(System.in);
  System.out.println("enter a emp no. :");
  empno=s.nextInt();
  System.out.println("enter a name :");
  name=s.next();
}
  void display(){
  System.out.println(empno+" "+name);
  }
 }
class TestEmployee6{
 public static void main(String args[]){
 Employee emp=new Employee();
 emp.display();
}
}
