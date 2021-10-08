//create a Deserialization class for Student class.
import java.io.*;
class DePersistTransientEx{
 public static void main(String[] args) throws Exception {
 FileInputStream fis=new FileInputStream("f:\\ioex\\myfile6.txt");
 ObjectInputStream ois=new ObjectInputStream(fis);
 Student s=(Student)ois.readObject();
 System.out.println(s.id+" "+s.name+" "+s.age);
 System.out.println("Deserialization process of class Student is Successful..");
 ois.close();
 }
}