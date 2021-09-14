//2.wap to create a student class which has 2 members id and name.
class Student1
{
 int id;
 String name;//instance variable
  //creating main method inside the student class.
 public static void main(String args[])
 {
 Student s1=new Student();//creating an object of student.
 s1.id=112;
 s1.name="James";
 //printing the values of the object.
  System.out.println("student id is ="+s1.id);
   System.out.println("student name is ="+s1.name);


 }
}