//1.Example of ByteArrayOutputStream class.
import java.io.*;
class ByteArrayOutputStreamEx{
public static void main(String args[])throws Exception{
 FileOutputStream fout1=new FileOutputStream("f:\\ioex\\iofile1.txt");
 FileOutputStream fout2=new FileOutputStream("f:\\ioex\\iofile2.txt");
 ByteArrayOutputStream bout=new ByteArrayOutputStream();
  bout.write(66);
  bout.writeTo(fout1);
  bout.writeTo(fout2);
  bout.flush();
  bout.close();
  System.out.println("Common Data is Written to multiple files.");
 }
}