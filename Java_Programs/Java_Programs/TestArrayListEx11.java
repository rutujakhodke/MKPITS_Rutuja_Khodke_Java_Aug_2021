//11.Java ArrayList Example.We are storing Student class object in an arraylist.
import java.util.*;
class Employee{
 int empid;
 String name;
 float salary;
public Employee(int empid,String name,float salary){
 this.empid=empid;
 this.name=name;
 this.salary=salary;
 }
}

public class TestArrayListEx11{
 public static void main(String args[]){
 Employee emp1=new Employee(112,"Amit",20000);
 Employee emp2=new Employee(113,"Raj",30000);
 Employee emp3=new Employee(114,"Ajay",50000);

 ArrayList<Employee> list=new ArrayList<Employee>();
 list.add(emp1);
 list.add(emp2);
 list.add(emp3);
 //creating iterator
 Iterator itr=list.iterator();
  while(itr.hasNext()){
   Employee e=(Employee)itr.next();
  System.out.println(e.empid+" "+e.name+" "+e.salary);
  }
 }
}