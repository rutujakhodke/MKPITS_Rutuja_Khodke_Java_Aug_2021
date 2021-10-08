//for Deserialization create a class DePersist.
import java.io.*;
public class DePersist{
 public static void main(String args[]){
 try{
	 //creating stream to read the object
    FileInputStream fis=new FileInputStream("f:\\ioex\\file2.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Customer1 c=(Customer1)ois.readObject();//deserialization
    //printing the data of the serialized object
    System.out.println("Customer Name is :"+c.name);
    System.out.println("Customer Email is :"+c.email);
    System.out.println("Customer class object is deserialized successfully..");
    //closing the stream
    ois.close();
   }catch(Exception e){
    System.out.println(e.toString());
   }
 }
}