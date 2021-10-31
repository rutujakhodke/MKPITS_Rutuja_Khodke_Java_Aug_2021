//6.wap to create a student class of members id and name and create 2 objects to store information through reference variable.
class Student
{
 int id;
 String name;
}
class TestStudent3
{
 public static void main(String args[])
 {
  Student s1=new Student();
  Student s2=new Student();
  //intializng the objects.
  s1.id=112;
  s1.name="Sonoo";

  s2.id=113;
  s2.name="Amit";

  System.out.println(s1.id+" "+s1.name);//printing the data.
  System.out.println(s2.id+" "+s2.name);
 }
}