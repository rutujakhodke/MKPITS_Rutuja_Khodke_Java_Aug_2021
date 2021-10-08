//create a class Persist1 for serialization
import java.io.*;
public class Persist1{
 public static void main(String args[]){
 try{
 //creating object of Student class
    Student14 s1=new Student14(121,"Aman Rao");
    //creating stream and write object
    FileOutputStream fos=new FileOutputStream("f:\\ioex\\file3.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(s1);//serialization
    oos.flush();
    oos.close();//closing the stream
    fos.close();
    System.out.println("Object of Student class is serialized successfully..");
 }catch(Exception e){
  System.out.println(e.toString());
 }
 }
}