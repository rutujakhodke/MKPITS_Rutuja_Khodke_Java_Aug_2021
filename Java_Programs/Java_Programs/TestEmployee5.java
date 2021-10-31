//5.Example of employee class with constructor and method.
class Employee{
 int empno;
 String name;
 //creating default constructor.
 public Employee(){
  System.out.println("Default constructor is called.");
  empno=190;
  name="Raj";
 }
 //creating method
 public void display(){
  System.out.println(empno+"  "+name);
 }
}
class TestEmployee5{
 public static void main(String args[]){
 Employee emp=new Employee();
 emp.display();
}
}