//8.Example of Transient keyword.create a class with a Transient variable.
import java.io.*;
 class Student implements Serializable{
 int id;
 String name;
 transient int age;//it will not serialized
 public Student(int id,String name,int age){
  this.id=id;
  this.name=name;
  this.age=age;
 }
}
public class PersistTransientEx{
 public static void main(String[] args) throws Exception{
 Student s=new Student(104,"Raavi",22);
 FileOutputStream fos=new FileOutputStream("f:\\ioex\\myfile6.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(s);
 oos.flush();
 oos.close();
 fos.close();
 System.out.println("Object of Student class is Serialized successfully..");
 }
}