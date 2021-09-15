//8.example of default and parameterized constructor.
import java.util.*;
class Employee{
 int empno;
 String name;
 //creating default constructor
 public Employee(){
  System.out.println("Default constructor is called.");
  empno=123;
  name="Raj";
  }
  //creating parametrized constructor.
  public Employee(int e,String n){
     System.out.println("Parametrized constructor is called.");
   empno=e;
   name=n;
  }
  //creating method display
  void display(){
  System.out.println(empno+"  "+name);
  }
  }
  class TestEmployee7{
  public static void main(String args[]){
   Employee emp=new Employee();
   emp.display();//it will display the default constructor values.
   
   Employee emp1=new Employee(124,"Arjun Shastri");
   emp1.display();//it will display the Parametrized constructor values.
  
  }
  }