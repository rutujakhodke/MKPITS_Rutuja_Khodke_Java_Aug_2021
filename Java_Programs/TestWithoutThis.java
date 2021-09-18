//5.example of java where this keyword is not required.
class Student{
int rollno;
String name;
float fee;

Student(int r,String n,float f){
rollno=r;//without using this keyword.
name=n;
fee=f;
}
void display(){
System.out.println(rollno+"  "+name+"  "+fee);
 }
}
class TestWithoutThis{
public static void main(String args[]){
Student s1=new Student(116,"Raj",4000f);
Student s2=new Student(117,"Amit",6000f);
s1.display();
s2.display();
 }
}