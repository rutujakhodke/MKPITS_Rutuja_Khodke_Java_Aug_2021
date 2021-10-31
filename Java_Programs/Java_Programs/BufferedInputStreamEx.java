//2.Example of BufferedInputStream class.
import java.io.*;
class BufferedInputStreamEx{
 public static void main(String args[]){
 try{
  FileInputStream fis=new FileInputStream("f://mytextfile.txt");
  BufferedInputStream bin=new BufferedInputStream(fis);
  int i;
  while((i=bin.read())!=-1){
   System.out.print((char) i);
 }
  }catch(Exception e){
   System.out.println(e);
  }
 }
}