//2.Example of super keyword.create a parent class Person ,then create a child class Student inherits from person class,by using constructor to invoke parent class constructor.
class Person{
 String name;
 String address;

 public Person(String name,String address){
  this.name=name;
  this.address=address;
  }
 void displayData(){
  System.out.println(name+" "+address);
 }
}
class Student extends Person{
 int rno;
 int marks;

 public Student(int rno,int marks,String name,String address){
  super(name,address);//calling parent class constructor
   this.rno=rno;
   this.marks=marks;
 }
 void displayData(){
 super.displayData();
 System.out.println(rno+" "+marks);
  }
}
class TestSuperConstructorCall1{
public static void main(String args[]){
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a Student Details");
int rno=scan.nextInt();
int marks=scan.nextInt();
String name=scan.next();
String address=scan.next();

Student s=new Student(rno,marks,name,address);
s.displayData();
 }
}