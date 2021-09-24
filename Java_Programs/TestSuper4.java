//4.create a Parent class Employee ,then create a child class PartTimeEmployee inherits from Employee class by using super keyword(invoke parent class method).
class Employee{
 int empId=112;
 float salary=10000;

void display(){
 System.out.println("Employee Id is ="+empId);
 System.out.println("Employee salary is ="+salary);
 }
}
class PartTimeEmployee extends Employee{
 int empId=113;
 float salary=15000;

 void display(){
 super.display();//calls method of parent class using super keyword
 System.out.println("Employee Id is ="+empId);
 System.out.println("Employee salary is ="+salary);
 }
}
class TestSuper4{
public static void main(String args[]){
PartTimeEmployee e1=new PartTimeEmployee();
e1.display();
 }
}