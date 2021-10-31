//2.JavaFileOutputStream example:Write String
import java.io.FileOutputStream;
class FileOutputStreamEx1{
 public static void main(String args[]){
 try{
  FileOutputStream fOut=new FileOutputStream("f://mytextfile.txt");
  String s="Welcome to MKPITS...";
  byte b[]=s.getBytes();//converting string data to byte array.
  fOut.write(b);
  fOut.close();
  System.out.println("Sucess..");
 }catch(Exception e){
  System.out.println(e);
  }
 }
}