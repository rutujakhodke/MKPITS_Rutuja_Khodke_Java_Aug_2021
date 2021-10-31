//12.Java ArrayList Example.To Serialize an ArrayList object and then deserialize it.
import java.io.*;
import java.util.*;
public class TestArrayListEx12{
 public static void main(String args[]){
 ArrayList<String> arr=new ArrayList<String>();
 arr.add("Amit");
 arr.add("Raj");
 arr.add("Anuj");
 //serialization
 try{
  FileOutputStream fos=new FileOutputStream("f:\\ioex\\array1.txt");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(arr);
  oos.close();
  fos.close();

  //deserialization
  FileInputStream fis=new FileInputStream("f:\\ioex\\array1.txt");
  ObjectInputStream ois=new ObjectInputStream(fis);
  ArrayList al=(ArrayList)ois.readObject();
  System.out.println("Student names are ="+al);
  }catch(Exception ee){
    System.out.println(ee);
  }
 }
 }