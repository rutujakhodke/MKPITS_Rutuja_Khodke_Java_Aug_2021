//3.create a class student has only one field with its setter and getter methods.
import java.util.*;
class Student{
 private String name;

 public String getName(){
	 return name;
 }
 public void setName(String name){
   this.name=name;
 }
}
 class TestStudent7{
 public static void main(String args[]){
 Scanner s=new Scanner(System.in);
 Student s1=new Student();
 System.out.println("Enter a Student Name.");
 String name=s.next();
 s1.setName(name);
 System.out.println(s1.getName());
 }
}

