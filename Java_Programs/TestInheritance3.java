//5.example of single inheritance.Create a parent class Person and then create a child class Employee.
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
class TestInheritance3{
 public static void main(String args[]){
 Employee e1=new Employee();
 e1.insertPersonData("Manit Kumar","Mumbai");
 e1.displayPersonData();
 e1.insertEmployeeData(134,23000);
 e1.displayEmployeeData();
 }
}