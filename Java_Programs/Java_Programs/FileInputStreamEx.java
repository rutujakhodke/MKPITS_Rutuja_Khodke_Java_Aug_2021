//1.Java FileInputStream example 1:read single character.
import java.io.FileInputStream;
class FileInputStreamEx{
 public static void main(String args[]){
 try{
 FileInputStream fis=new FileInputStream("f://mytextfile.txt");
 int i=fis.read();
 System.out.println((char) i);
 fis.close();
 }catch(Exception e){
  System.out.println(e);
 }
}
}