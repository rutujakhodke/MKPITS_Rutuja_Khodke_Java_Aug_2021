//9.example of method overloading.
class Student{
 void getData(String name){
  System.out.println("Name of a Student is :"+name);
 }
 void getData(String name,String address){
  getData("Amit Kumar");//calls the getData() method
  System.out.println("Address of a Student is :"+address);
 }
}
class TestMethodOverload8{
public static void main(String[] args){
Student s=new Student();
s.getData("Amit Kumar","Sadar Nagpur");
 }
}