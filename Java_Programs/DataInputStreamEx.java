//2.Example of DataInputStream class.
import java.io.*;
class DataInputStreamEx{
public static void main(String args[])throws Exception{
InputStream input=new FileInputStream("f:\\myfile2.txt");
DataInputStream inst=new DataInputStream(input);
int count=input.available();
System.out.println("count :"+count);
byte[] arr=new byte[count];
inst.read(arr);
for(byte bt:arr){
 char k=(char) bt;
 System.out.print(k+"-");
  }
 }
}