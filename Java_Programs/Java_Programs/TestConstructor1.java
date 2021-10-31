//2.example of this() constructor.call to this() constructor must be the first statement in constructor.
class Student{
 int rollno;
 String name,course;
 float fee;

 Student(int rollno,String name,String course){
  this.rollno=rollno;
  this.name=name;
  this.course=course;
 }
 Student(int rollno,String name,String course,float fee){
  this.fee=fee;
  this(rollno,name,course);//compile time error (this() constructor must be the first statement in constructor.)
 }
 void display(){
  System.out.println(rollno+" "+name+" "+course+" "+fee);
 }
}
class TestConstructor1{
public static void main(String args[]){
Student s1=new Student(112,"Amit","Java");
Student s2=new Student(113,"Sumit","Python",2000f);
 s1.display();
 s2.display();
 }
}