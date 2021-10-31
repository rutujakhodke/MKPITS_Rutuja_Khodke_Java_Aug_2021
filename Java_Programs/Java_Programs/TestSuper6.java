//4.create a Parent class Person ,then create a child class Student inherits from Person class by using super keyword(invoke parent class method).
class Person{
 String name;
 String address;

 void getData(String name,String address){
  this.name=name;
  this.address=address;
 }
 void displayData(){
  System.out.println("Name ="+name + " Address ="+address);
 }
}
class Student extends Person{
 int rno;
 int marks;

 void getData(int rno,int marks,String name,String address){
   getData(name,address);//calling parent class method
   this.rno=rno;
   this.marks=marks;
 }
 void displayData(){
 super.displayData();
 System.out.println("Roll No ="+ rno + " Marks ="+marks);
 }
}
class TestSuper6{
public static void main(String args[]){
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter a Student Details :");
System.out.println("Enter a Student Name :");
String name=s.next();
System.out.println("Enter a Student Address :");
String address=s.next();
System.out.println("Enter a Student Roll No :");
int rno=s.nextInt();
System.out.println("Enter a Student Marks :");
int marks=s.nextInt();

Student s1=new Student();
s1.getData(rno,marks,name,address);
s1.displayData();
 }
}
