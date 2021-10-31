//2.example of sequenceInputstream.that reads the data from two files and writes into another file.
import java.io.*;
class SequenceInputStreamEx1{
  public static void main(String args[])throws Exception{
  FileInputStream fin1=new FileInputStream("f://myfile2.txt");
  FileInputStream fin2=new FileInputStream("f://myfile3.txt");
  FileOutputStream fout=new FileOutputStream("f://myoutfile1.txt");
  SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
  
   int i;
   while((i=sis.read())!=-1){
    fout.write(i);
   }
   sis.close();
   fout.close();
   fin1.close();
   fin2.close();
   System.out.println("Data written in two file successfully...");
 }
}