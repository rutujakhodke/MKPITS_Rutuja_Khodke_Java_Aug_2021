//2.wap of java to create a class employee using constructor.(default)
class Employee{
 int empno;//we have not created constructor in this class.
 String name;

 }
 class TestEmployee3{
  public static void main(String args[]){
  Employee emp=new Employee();//it calls default constructor when it is not available in class
   System.out.println("Employee Number is :"+emp.empno);
   System.out.println("Employee Name is :"+emp.name);
 }
 }