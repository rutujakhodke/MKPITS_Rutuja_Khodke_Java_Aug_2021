//5.wap to create a student class by initialization through reference.
class Student
{
int id;
String name;

}
class TestStudent2
{
 public static void main(String args[])
 {
	Student s1=new Student();
	s1.id=115;//reference through initialization.
	s1.name="Ram";
	System.out.println(s1.id+" "+s1.name);//printing members with white space.
 }
}