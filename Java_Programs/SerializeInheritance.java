//4.Example of Serialization with Inheritance(IS-A relationship).
import java.io.*;
class Person implements Serializable{
 int id;
 String name;
 public Person(int id,String name){
  this.id=id;
  this.name=name;
 }
}
class Student extends Person{
 String course;
 float fee;
 public Student(int id,String name,String course,float fee){
  super(id,name);
  this.course=course;
  this.fee=fee;
 }
}
public class SerializeInheritance{
 public static void main(String args[]){
  try{
    Student s1=new Student(101,"Raavi Singh","Engineering",50000f);
    FileOutputStream fos=new FileOutputStream("f:\\ioex\\myfile2.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(s1);
    oos.flush();
    oos.close();
    fos.close();
    System.out.println("Object of Student class is serialized successfully..");
  }catch(Exception e){
   System.out.println(e.toString());
  }
  try{
    FileInputStream fis=new FileInputStream("f:\\ioex\\myfile2.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Student s1=(Student)ois.readObject();
    System.out.println(s1.id+" "+s1.name+" "+s1.course+" "+s1.fee);
    System.out.println("Object of Student class is deserialized successfully..");
    ois.close();
  }catch(Exception e){
   System.out.println(e.toString());
  }
 }
}