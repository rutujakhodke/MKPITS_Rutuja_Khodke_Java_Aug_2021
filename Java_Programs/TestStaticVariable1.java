//1.java program to demonstrate the use of static variable.
class Student{
 int rollno;//instance variable
 String name;
 static String college="KDK";//static variable
 //constructor
 Student(int r,String n){
  rollno=r;
  name=n;
 }
  //method to display values.
  public void display(){
  System.out.println(rollno+" "+name+" "+college);
  }
 }

  //TestStudent class to show the values of objects.
  class TestStaticVariable1{
   public static void main(String args[]){
   Student s1=new Student(112,"Raj");
   Student s2=new Student(113,"Amit");
   //we can change the college of all objects by the single line of code.
   //Student.college="NPN";
   s1.display();
   s2.display();
   }
  }
