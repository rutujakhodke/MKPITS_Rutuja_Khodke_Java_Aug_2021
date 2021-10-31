//3.wap of java for creating class employee by using default constructor.
class Employee{
 int empno;
 String name;
 //creating constructor(default constructor (no-arg constructor))
 public Employee(){ //creating constructor
   empno=123;
   name="Ranjan";

 }

}
class TestEmployee4{
 public static void main(String args[]){

 Employee emp=new Employee();//object or instance of a class is created.
 //System.out.println("Emloyee Number is :"+emp.empno);//123
 //System.out.println("Employee Name is :"+emp.name);//Ranjan
 System.out.println(emp.empno+" "+emp.name);
}
}