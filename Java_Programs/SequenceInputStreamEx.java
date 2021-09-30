//1.Example of Java SequenceInputStream.we are printing the data of two files.
import java.io.*;
class SequenceInputStreamEx{
 public static void main(String args[])throws Exception{
 FileInputStream input1=new FileInputStream("f://myfile2.txt");
 FileInputStream input2=new FileInputStream("f://myfile3.txt");
 SequenceInputStream inst=new SequenceInputStream(input1,input2);
  int j;
  while((j=inst.read())!=-1){
   System.out.print((char) j);
  }
  inst.close();
  input1.close();
  input2.close();
 }
}