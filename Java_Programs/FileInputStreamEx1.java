//2.Java FileInputStream example 1:read all character.
import java.io.FileInputStream;
class FileInputStreamEx1{
 public static void main(String args[]){
 try{
  FileInputStream fis=new FileInputStream("f://mytextfile.txt");
   int i=0;
   while((i=fis.read())!=-1){
    System.out.print((char) i);
   }
    fis.close();
 }catch(Exception ee){
  System.out.println(ee.toString());
 }
}
}

