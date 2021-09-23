//6.create a read-only class Student having getter methods.
class Student{
private String college="KDK";//private data member

public String getCollege(){//getter method for college.
	return college;
 }
}
class TestStudent8{
public static void main(String[] args){
Student s1=new Student();
//s1.setCollege("RKNEC");//will render compile time error.
System.out.println("College name is ="+s1.getCollege());
 }
}
