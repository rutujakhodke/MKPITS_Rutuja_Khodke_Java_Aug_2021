//1.JavaFileOutputStream example:Write byte
import java.io.FileOutputStream;
class FileOutputStreamEx{
 public static void main(String args[]){
  try{
  FileOutputStream fOut=new FileOutputStream("f://mytextfile.txt");
  fOut.write(65);
  fOut.close();
  System.out.println("Success...");
  }catch(Exception e){
   System.out.println(e);
  }
 }
}