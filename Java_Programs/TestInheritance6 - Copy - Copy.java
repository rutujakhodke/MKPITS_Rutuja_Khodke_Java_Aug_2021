//8.(example of multilevel inheritance).create a class Person,then create a class Employee inherited from Person class,then create a class PartTimeEmployee inherited from Employee class.
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
  System.out.println(empno+"  "+salary);
  }
}
class PartTimeEmployee extends Employee{
 int hours;

 void insertPartTimeEmployeeData(int hours){
  this.hours=hours;
 }
 void displayPartTimeEmployeeData(){
 System.out.println("Employee working hours are ="+hours);
 }
}
class TestInheritance6{
public static void main(String args[]){
PartTimeEmployee emp=new PartTimeEmployee();
emp.insertPersonData("Amit Kumar","Nagpur");
emp.displayPersonData();
emp.insertEmployeeData(130,30000);
emp.displayEmployeeData();
emp.insertPartTimeEmployeeData(4);
emp.displayPartTimeEmployeeData();
 }
}