//1.wap of java to create a class employee using constructor(default constructor)
class Employee{
 //we have not created constructor in this class.
 int empno;

 void insert(int e){
  empno=e;
 }
 void display(){
	System.out.println("Emloyee number is :"+empno);
 }
}

 class TestEmployee2{
  public static void main(String args[]){
  //every time an object is created using the new() keyword and least one constructor is called.
  Employee emp=new Employee();//it calls a default constructor if there is no constructor available in a class.
  emp.insert(100);//calling insert method
  emp.display();
 }
}