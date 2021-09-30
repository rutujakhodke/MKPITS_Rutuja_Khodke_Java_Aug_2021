//3.Example of Java SequenceInputStream that reads data using enumeration.
import java.io.*;
import java.util.*;
class SequenceInputStreamEx2{
  public static void main(String args[])throws IOException{
  FileInputStream fin1=new FileInputStream("f://a.txt");
  FileInputStream fin2=new FileInputStream("f://b.txt");
  FileInputStream fin3=new FileInputStream("f://c.txt");
  FileInputStream fin4=new FileInputStream("f://d.txt");
  //creating vector object to all stream
  Vector v=new Vector();
  v.add(fin1);
  v.add(fin2);
  v.add(fin3);
  v.add(fin4);
  //creating enumeration object by calling the elements method
  Enumeration e=v.elements();
  //passing the enumeration object in the constructor
  SequenceInputStream sis=new SequenceInputStream(e);
  int i=0;
  while((i=sis.read())!=-1){
   System.out.print((char) i);
  }
  sis.close();
  fin1.close();
  fin2.close();
  fin3.close();
  fin4.close();
  }
 }