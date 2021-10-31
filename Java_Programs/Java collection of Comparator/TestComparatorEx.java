import java.util.*;
public class TestComparatorEx{
  public static void main(String args[]){
  ArrayList<Student15> list=new ArrayList<Student15>();
  list.add(new Student15(101,"Ajay",24));
  list.add(new Student15(104,"Jai",28));
  list.add(new Student15(103,"Ravi",21));
  //sorting elements on the basis of name
  Comparator<Student15> cmp=Comparator.comparing(Student15::getName);
  Collections.sort(list,cmp);
  System.out.println("Sorting by Name");
  for(Student15 stud:list){
   System.out.println(stud.rollno+" "+stud.name+" "+stud.age);
  }
  //sorting elements on the basis of age
  Comparator<Student15> cmp1=Comparator.comparing(Student15::getAge);
  Collections.sort(list,cmp1);
  System.out.println("Sorting by Age");
  for(Student15 stud:list){
   System.out.println(stud.rollno+" "+stud.name+" "+stud.age);
  }
}
}