//12.(example of hierarchical inheritance).create a parent class Person haaving common fields name,address and methods,create a child class Student inherited from Person class having additional fields rno,
//marks and methods.create a child class Employee inherited from Person class having additional fields empno,salary and methods.
//create a parent class Person
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
//create a child class Student inherited from class Person.
class Student extends Person{
 int rno;
 int marks;

void insertStudentData(int rno,int marks){
 this.rno=rno;
 this.marks=marks;
}
void displayStudentData(){
 System.out.println(rno+"  "+marks);
 }
}
//create a child class Employee inherited from class Person.
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
//create a main class
class TestInheritance10{
public static void main(String args[]){
System.out.println("-----Enter a Employee Details---");
Employee emp=new Employee();//create a Employee class instance.
java.util.Scanner scan=new java.util.Scanner(System.in);

System.out.println("Enter a Employee Name :");
String empName=scan.next();
System.out.println("Enter a Employee Address :");
String empAddress=scan.next();
emp.insertPersonData(empName,empAddress);

System.out.println("Enter a Employee Number :");
int empno=scan.nextInt();
System.out.println("Enter a Employee Salary :");
float salary=scan.nextFloat();
emp.insertEmployeeData(empno,salary);
emp.displayPersonData();
emp.displayEmployeeData();

System.out.println("---Enter a Student Details----");
Student s1=new Student();//create a Student class instance.
System.out.println("Enter a Student Name :");
String studName=scan.next();
System.out.println("Enter a Student Address :");
String studAddress=scan.next();
s1.insertPersonData(studName,studAddress);

System.out.println("Enter a Student rno :");
int rno=scan.nextInt();
System.out.println("Enter a Student Marks :");
int marks=scan.nextInt();
s1.insertStudentData(rno,marks);
s1.displayPersonData();
s1.displayStudentData();
  }
 }