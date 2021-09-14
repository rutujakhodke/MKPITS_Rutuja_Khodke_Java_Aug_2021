//10.create a class student and initialize it with method.
class Student
{
 int rollno;
 String name;

 void insertRecord(int r,String n)
 {
 rollno=r;
 name=n;
 }
 void displayInformation()
 {
  System.out.println(rollno+" "+name);

 }
}
 class TestStudent4
 {
  public static void main(String args[])
  {
   Student s1=new Student();
   Student s2=new Student();

   s1.rollno=111;//reference variable
   s1.name="Amit";

   s2.rollno=114;
   s2.name="Aman";

   System.out.println(s1.rollno);
   System.out.println(s1.name);

   System.out.println(s2.rollno);
   System.out.println(s2.name);

   s1.insertRecord(112,"Karan");
   s1.displayInformation();

   s2.insertRecord(113,"Ram");
   s2.displayInformation();


  }
 }
