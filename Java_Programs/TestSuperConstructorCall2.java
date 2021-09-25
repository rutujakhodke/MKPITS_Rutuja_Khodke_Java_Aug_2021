//3.Example of super keyword.create a parent class Person ,then create a child class Employee inherits from person class,by using constructor to invoke parent class constructor.
class Person{
 String name;
 String address;

 public Person(String name,String address){
  this.name=name;
  this.address=address;
 }
 void displayData(){
 System.out.println(name+"  "+address);
 }
}
class Employee extends Person{
 int empId;
 float salary;

 public Employee(int empId,float salary,String name,String address){
  super(name,address);//call parent class constructor
   this.empId=empId;
   this.salary=salary;
 }
 void displayData(){
 super.displayData();//call parent class display method
 System.out.println(empId+" "+salary);
 }
}
class TestSuperConstructorCall2{
public static void main(String args[]){
Employee emp=new Employee(114,10000,"Amit Kumar","Sadar Nagpur");
emp.displayData();
 }
}