//9.Example of Transient keyword.create a Student class and accept a values from user using Scanner class.
import java.io.*;
import java.util.*;
class Student implements Serializable{
 int id;
 String name;
 transient int age;
 public Student(int id,String name,int age){
  this.id=id;
  this.name=name;
  this.age=age;
 }
}
public class PersistTransientEx1{
 public static void main(String[] args) throws Exception {
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter a Student Id :");
 int id=scan.nextInt();
 System.out.println("Enter a Student Name :");
 String name=scan.next();
 System.out.println("Enter a Student age :");
 int age=scan.nextInt();
 Student s1=new Student(id,name,age);
 FileOutputStream fos=new FileOutputStream("f:\\ioex\\file4.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(s1);
 oos.flush();
 oos.close();
 fos.close();
 System.out.println("Object of Student class is serialized successfully..");
 }
}