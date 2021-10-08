//create a Desiralization class for Student class.
import java.io.*;
class DePersistTransientEx1{
 public static void main(String[] args) throws Exception{
 FileInputStream fis=new FileInputStream("f:\\ioex\\file4.txt");
 ObjectInputStream ois=new ObjectInputStream(fis);
 Student s11=(Student)ois.readObject();
 System.out.println(s11.id+" "+s11.name+" "+s11.age);
 System.out.println("Deserialization process of Student class is Successful..");
 ois.close();
 }
}