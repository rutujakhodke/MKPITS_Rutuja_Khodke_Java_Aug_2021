//3.wap to create a student class of members id and name.create 2 object of same class.
class Student2
{
 int id;
 String name;

  public static void main(String args[])
  {
	 Student s1=new Student();
	 s1.id=113;
	 s1.name="Scott";
	 System.out.println("student id is :"+s1.id);
	 System.out.println("student name is :"+s1.name);
     System.out.println("      ");

	 Student s2=new Student();
	 s2.id=114;
	 s2.name="Miller";
	 System.out.println("student id is :"+s2.id);
	 System.out.println("student name is :"+s2.name);
  }
}