//1.Create a parent class Person having fields name and address then create a inherited class Student having new fields rno and marks.
//creating parent class Person
class Person{
String name;
String address;

}
//creating child class Student
class Student extends Person{//child class extends parent class
 int rno;
 int marks;

}
//creating main class TestInheritance
class TestInheritance{
public static void main(String args[]){
Student s1=new Student();//creating instance of child class i.e Student
s1.rno=12;
s1.marks=89;
s1.name="Ram Kumar";
s1.address="Sadar Nagpur";

System.out.println("rno ="+s1.rno);
System.out.println("marks ="+s1.marks);
System.out.println("name ="+s1.name);
System.out.println("address ="+s1.address);
 }
}