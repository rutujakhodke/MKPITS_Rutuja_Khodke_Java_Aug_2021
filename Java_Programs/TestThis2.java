//2.example of java with this keyword.
class Student{
int rollno;
String name;
float fee;

Student(int rollno,String name,float fee){
this.rollno=rollno;//assigning this keyword to instance variable.
this.name=name;
this.fee=fee;

}
public void display(){
System.out.println(rollno+" "+name+" "+fee);
 }
}
class TestThis2{
public static void main(String args[]){
Student s1=new Student(112,"Raj",5000);
Student s2=new Student(113,"Karan",6000);
s1.display();
s2.display();

 }
}