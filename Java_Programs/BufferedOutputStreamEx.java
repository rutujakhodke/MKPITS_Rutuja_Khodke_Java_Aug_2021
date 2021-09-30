//1.Example of BufferedOutputStream class.
import java.io.*;
class BufferedOutputStreamEx{
 public static void main(String args[])throws Exception{
 FileOutputStream fOut=new FileOutputStream("f://mytextfile.txt");
 BufferedOutputStream bOut=new BufferedOutputStream(fOut);
 String s="Hello from MKPITS...!";
 byte b[]=s.getBytes();
 bOut.write(b);
 bOut.flush();
 bOut.close();
 fOut.close();
 System.out.println("Success----");
  }
 }