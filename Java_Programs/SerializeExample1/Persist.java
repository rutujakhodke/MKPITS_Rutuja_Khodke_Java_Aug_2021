//for serialization create a class Persist.
import java.io.*;
public class Persist{
 public static void main(String args[]){
 try{
	 //creating the object
    Customer1 c=new Customer1("Amit Kumar","amit@gmail.com");
    //creating stream and writing the object
    FileOutputStream fos=new FileOutputStream("f:\\ioex\\file2.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(c);//serialization
    oos.flush();
    //closing the stream
    oos.close();
    fos.close();
    System.out.println("Object of class Customer created successfully..");
 }catch(Exception e){
  System.out.println(e);
 }
 }
}