//3.JavaFileOutputStream example:Write String(name).
import java.io.*;
import java.util.*;
class FileOutputStreamEx2{
 public static void main(String args[]){
 try{
  FileOutputStream fs=new FileOutputStream("f://myoutfile.txt");
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter your Name :");

  String str="Name";
  str +=scan.nextLine();//name with space
  byte[] arr=str.getBytes();

  fs.write(arr);
  fs.close();
  System.out.println("Data written to the file Successfully..");
 }catch(Exception ee){
  System.out.println(ee.toString());
  }
 }
 }

