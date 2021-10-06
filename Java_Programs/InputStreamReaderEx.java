//1.Example of Java InputStreamReader class.
import java.io.*;
class InputStreamReaderEx{
 public static void main(String args[]){
 try{
 InputStream stream=new FileInputStream("f:\\ioex\\ioinputs.txt");
 Reader reader=new InputStreamReader(stream);
 int data=reader.read();
  while(data!=-1){
   System.out.print((char) data);
   data=reader.read();
  }
 }catch (Exception e){
  e.printStackTrace();
  }
 }
}