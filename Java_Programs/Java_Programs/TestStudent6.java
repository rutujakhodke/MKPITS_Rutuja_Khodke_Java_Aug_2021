//4.java program to demonstrate the use of a static method.
class Student{
int rollno;
String name;
static String college="MKPITS";
//static method to change the value of static variable.
static void change(){
 college="KDK";
 }
 //constructor to initalize the variable.
 Student(int r,String n){
  rollno=r;
  name=n;
  }
  //display method
  void display(){
  System.out.println(rollno+" "+name+" "+college);
  }
}
class TestStaticMethod{
public static void main(String args[]){
Student.change();//calling change method(classname.methodname)
Student s1=new Student(112,"Ajit");
Student s2=new Student(113,"Raj");
Student s3=new Student(114,"Ram");
Student s4=new Student(115,"Amit");
//calling display method
s1.display();
s2.display();
s3.display();
s4.display();
 }
}









