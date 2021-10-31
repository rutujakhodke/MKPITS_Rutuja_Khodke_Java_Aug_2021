//8.create a write-only class Book having setter methods.
class Student13{
private String college;

public void setCollege(String college){
 this.college=college;
}
public void display(){
System.out.println("College name of a Student is :"+college);
}

public static void main(String args[]){
Student13 s1=new Student13();
s1.setCollege("KDK");
s1.display();
//System.out.println(s1.getCollege());//compile time error bcoz there is no such method.
System.out.println(s1.college);//KDK
 }
}