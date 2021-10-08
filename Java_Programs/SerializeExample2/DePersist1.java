//create a class DePersist1 for deserialization
 import java.io.*;
 class DePersist1{
 public static void main(String args[]){
 try{
   //creating stream for read object
    FileInputStream fis=new FileInputStream("f:\\ioex\\file3.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Student14 s1=(Student14)ois.readObject();//deserialization
    System.out.println(s1.id+" "+s1.name);
    System.out.println("Student class object is deserialized successfully..");
    ois.close();
    fis.close();
 }catch(Exception e){
   System.out.println(e.toString());
  }
 }
}

