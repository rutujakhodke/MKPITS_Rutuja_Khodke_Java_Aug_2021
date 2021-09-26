//2.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that
//of name as "John" by creating an object of the class Student.
class Student{
 String name;//instance variable
 int roll_no;
}
class TestStudentData{
public static void main(String[] args){
Student s=new Student();//creating instance or object of a class Student
s.name="John";//intialize the instance variables
s.roll_no=2;
System.out.println("Student Name is ="+s.name);//accessing instance variables through reference of instance or object.
System.out.println("Student Roll No is ="+s.roll_no);
 }
}