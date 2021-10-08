//create a class DePersist2 for deserialization.
import java.io.*;
 class DePersist2{
 public static void main(String args[]){
 try{
 FileInputStream fis=new FileInputStream("f:\\ioex\\myfile1.txt");
 ObjectInputStream ois=new ObjectInputStream(fis);
 Employee3 e1=(Employee3)ois.readObject();
 System.out.println(e1.empId+" "+e1.empName+" "+e1.salary);
 System.out.println("Student class object is deserialized successfully..");
 ois.close();
 fis.close();
 }catch(Exception e){
  System.out.println(e);
  }
  }
 }