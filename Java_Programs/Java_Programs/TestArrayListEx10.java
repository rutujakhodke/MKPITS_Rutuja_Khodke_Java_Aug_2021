//10.Java ArrayList Example.We are storing Student class object in an arraylist.
import java.util.*;
class Student{
 int rollno;
 String name;
 int age;
 public Student(int rollno,String name,int age){
  this.rollno=rollno;
  this.name=name;
  this.age=age;
 }
}

public class TestArrayListEx10{
 public static void main(String args[]){
 //creating user defined class object
 Student s1=new Student(101,"Amit",22);
 Student s2=new Student(102,"Raj",23);
 Student s3=new Student(103,"Vijay",24);
 //creating ArrayList
 ArrayList<Student> list=new ArrayList<Student>();
 list.add(s1);//Adding Student class object
 list.add(s2);
 list.add(s3);
 //creating Iterator
 Iterator itr=list.iterator();
 //traverse the elements arrayList object
  while(itr.hasNext()){
  Student stud=(Student)itr.next();
  System.out.println(stud.rollno+" "+stud.name+" "+stud.age);
  }
 }
}