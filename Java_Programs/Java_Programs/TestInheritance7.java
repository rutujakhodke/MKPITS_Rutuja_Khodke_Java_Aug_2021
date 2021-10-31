//9.(example of multilevel inheritance).create a class Person,then create a class Employee inherited from Person class,then create a class PartTimeEmployee inherited from Employee class.(accepting values from the user).
class Person{
 String name;
 String address;

 void insertPersonData(String name,String address){
  this.name=name;
  this.address=address;
  }
 void displayPersonData(){
  System.out.println(name+"  "+address);
  }
}
class Employee extends Person{
 int empno;
 float salary;

 void insertEmployeeData(int empno,float salary){
  this.empno=empno;
  this.salary=salary;
  }
 void displayEmployeeData(){
  System.out.println(empno+" "+salary);
  }
}
class PartTimeEmployee extends Employee{
 int hours;

 void insertPartTimeEmployeeData(int hours){
  this.hours=hours;
 }
 void displayPartTimeEmployeeData(){
 System.out.println("Working hours of Employee is ="+hours);
  }
}
class TestInheritance7{
public static void main(String args[]){
PartTimeEmployee emp=new PartTimeEmployee();
java.util.Scanner scan=new java.util.Scanner(System.in);

System.out.println("Enter a Employee Name :");
String name=scan.next();
System.out.println("Enter a Employee Address :");
String address=scan.next();
emp.insertPersonData(name,address);

System.out.println("Enter a Employee Number :");
int empno=scan.nextInt();
System.out.println("Enter a Employee Salary :");
float salary=scan.nextFloat();
emp.insertEmployeeData(empno,salary);

System.out.println("Enter a Employee Working Hours :");
int hours=scan.nextInt();
emp.insertPartTimeEmployeeData(hours);

emp.displayPersonData();
emp.displayEmployeeData();
emp.displayPartTimeEmployeeData();
 }
}
