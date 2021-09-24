//3.Create a class Employee ,then create a child class PartTimeEmployee inherited from Employee ,to refer the immediate parent class instance variable by using super keyword.
class Employee{
 String empName="Amit";
}
class PartTimeEmployee extends Employee{
 String empName="Rajesh";

 void display(){
  System.out.println(empName);//it prints partTimeEmployee name
  System.out.println(super.empName);//it prints Employee name
 }
}
class TestSuper3{
public static void main(String args[]){
PartTimeEmployee e1=new PartTimeEmployee();
e1.display();
 }
}