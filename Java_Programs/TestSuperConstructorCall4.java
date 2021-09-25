//5.Example of super keyword.create a parent class Person ,then create a child class Employee inherits from person class,by using constructor to invoke parent class constructor.(reuse of parent class constructor).
class Person{
 int id;
 String name;
 
 public Person(int id,String name){
   this.id=id;
   this.name=name;
 }
}
class Employee extends Person{
 float salary;
 
 public Employee(int id,String name,float salary){
  super(id,name);//reusing parent constructor
   this.salary=salary;
 }
 void display(){
 System.out.println(id+" "+name+" "+salary);
 }
}
class TestSuperConstructorCall4{
public static void main(String args[]){
Employee emp=new Employee(141,"Amit Kumar",30000);
emp.display();
 }
}
