//1.example of java without this keyword.
class Student{
int rollno;//instance variable
String name;
float fee;

public Student(int rollno,String name,float fee){
 rollno=rollno;//name of instance variable and constructor parameters are same.
 name=name;//local variable
 fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+fee);

 }
}
class TestThis1{

public static void main(String args[]){
Student s1=new Student(112,"Raj",10000);
Student s2=new Student(113,"Karan",20000);
s1.display();
s2.display();
 }
}