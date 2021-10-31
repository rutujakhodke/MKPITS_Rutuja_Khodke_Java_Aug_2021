//4.example of single inheritance.Create a parent class Person and then create a child class Student.
class Person{
 String name;
 String address;
 
 void insertPersonData(String name,String address){
  this.name=name;
  this.address=address;
 }
 void displayPersonData(){
  System.out.println(name+"  "+address);
 }
}
class Student extends Person{
 int rno;
 int marks;
 
 void insertStudentData(int rno,int marks){
  this.rno=rno;
  this.marks=marks;
 }
 void displayStudentData(){
  System.out.println(rno+"  "+marks);
 }
}
class TestInheritance2{
 public static void main(String args[]){
 Student s1=new Student();
 s1.insertPersonData("Amit Kumar","Gondia");
 s1.displayPersonData();
 s1.insertStudentData(14,90);
 s1.displayStudentData();
 }
}